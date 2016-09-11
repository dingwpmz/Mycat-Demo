package persistent.prestige.modules.edu.service;

public interface UserSchemeService {
	String findTenant(String account);
	
	Integer findDbPos(String account);
}
