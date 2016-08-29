package persistent.prestige.platform.utils;

import java.util.UUID;

public class UUidUtils {
	
	public static final String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
