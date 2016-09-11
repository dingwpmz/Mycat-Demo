package persistent.prestige.modules.edu.model;

import java.io.Serializable;

public class GlobalUser implements Serializable{
	
	private String account;
	
	private Integer dbPos;
	
	private String tenant;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getDbPos() {
		return dbPos;
	}

	public void setDbPos(Integer dbPos) {
		this.dbPos = dbPos;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	

}
