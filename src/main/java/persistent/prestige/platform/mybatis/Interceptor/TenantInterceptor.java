package persistent.prestige.platform.mybatis.Interceptor;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.kahadb.page.Page;
import org.springframework.beans.factory.annotation.Autowired;

import persistent.prestige.modules.common.tenant.TenantContextHolder;
import persistent.prestige.modules.edu.dao.TeacherUserDao;

@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class TenantInterceptor implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		
		String tenant = TenantContextHolder.getTenant();
		
		if(tenant == null || tenant == "") {
			System.out.println("tenant 为空，不需要改写sql语句");
			return invocation.proceed();
		}

		if (invocation.getTarget() instanceof RoutingStatementHandler) {

			System.out.println("aaaaaaa");
			RoutingStatementHandler statementHandler = (RoutingStatementHandler) invocation
					.getTarget();
			StatementHandler delegate = (StatementHandler) ReflectHelper
					.getFieldValue(statementHandler, "delegate");
			BoundSql boundSql = delegate.getBoundSql();
			Object obj = boundSql.getParameterObject();
			
			
			// 通过反射获取delegate父类BaseStatementHandler的mappedStatement属性
			MappedStatement mappedStatement = (MappedStatement) ReflectHelper
					.getFieldValue(delegate, "mappedStatement");
			// 拦截到的prepare方法参数是一个Connection对象
			Connection connection = (Connection) invocation.getArgs()[0];
			// 获取当前要执行的Sql语句，也就是我们直接在Mapper映射语句中写的Sql语句
			String sql = boundSql.getSql();
			// 给当前的page参数对象设置总记录数
			System.out.println("处理之前" + sql);
			//对 sql 增加 mycat 注解
			
			
			sql = "/*!mycat:schema=" + tenant + " */" + sql;
			
			System.out.println("加入处理后:" + sql);
			
			
			
			ReflectHelper.setFieldValue(boundSql, "sql", sql);
			
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		// TODO Auto-generated method stub
		if (target instanceof StatementHandler) {
			return Plugin.wrap(target, this);
		} else {
			return target;
		}
	}

	@Override
	public void setProperties(Properties properties) {
		// TODO Auto-generated method stub

	}

}
