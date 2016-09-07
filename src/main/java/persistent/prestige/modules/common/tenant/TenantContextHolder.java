package persistent.prestige.modules.common.tenant;


public class TenantContextHolder {
	public static final String DEFAULT_TENANT_SCHEME = "TESTDB";
	
	private static ThreadLocal<String> tenanThreadLocal = new ThreadLocal<String>();
	
	
	public static final void setTenant(String scheme) {
		tenanThreadLocal.set(scheme);
	}
	
	public static final String getTenant() {
		String scheme = tenanThreadLocal.get();
		if (scheme == null || scheme == "") {
			scheme = DEFAULT_TENANT_SCHEME;
		}
		return scheme;
	}
	
	public static final void remove() {
		tenanThreadLocal.remove();
	}
	
	

}
