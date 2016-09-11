package persistent.prestige.modules.common.tenant;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import persistent.prestige.modules.edu.service.UserSchemeService;
public class TenantControlInteceper implements MethodInterceptor {
	@Autowired
	private UserSchemeService userScemeService;
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			if("login".equals(invocation.getMethod().getName())) {
				return invocation.proceed();
			}
			
			System.out.println("控制器层面，，计算 tenant。。。");
			Object[] args = invocation.getArguments();
			String tenant = "";
			if( args != null && args.length > 0) {
				tenant = (String)args[0];
			}
			TenantContextHolder.setTenant(tenant);
			return invocation.proceed();
		}finally {
			TenantContextHolder.remove();
			System.out.println("控制器层面，，移除tenant。。。");
		}
		
	}

}
