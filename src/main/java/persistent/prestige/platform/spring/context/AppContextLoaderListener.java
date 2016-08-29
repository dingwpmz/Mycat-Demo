package persistent.prestige.platform.spring.context;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;




/**
 * @Title:AppContextLoaderListener.java
 * @Package persistent.prestige.context
 * @Description TODO
 * @author prestigeding
 * @date 2012-12-18 上午12:07:10
 * @version V1.0
 */

public class AppContextLoaderListener extends ContextLoaderListener {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		//初使化　应用环境上下文Util
//		SpringContextUtils.initialize(event.getServletContext());
//		PropertyHolder.initialize();
	}

	
}

