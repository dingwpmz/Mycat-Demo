package persistent.prestige.modules.common.tenant;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 控制器层拦截器
 * @author Administrator
 *
 */
public class TenantControlInteceper implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			System.out.println("控制器层面，，计算 tenant。。。");
			//从登陆信息中获取 当前用户的 tenant
			// invocation.getArguments();
			//最好能从登陆名，根据某种算法，判断出该数据库属于哪个 逻辑库
			String tenant = "TESTDB";
			TenantContextHolder.setTenant(tenant);
			return invocation.proceed();
		}finally {
			TenantContextHolder.remove();
			System.out.println("控制器层面，，移除tenant。。。");
		}
		
	}

}
