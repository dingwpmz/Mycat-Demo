package persistent.prestige.platform.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * @Title: 
 * @Package persistent.prestige.platform.base.annotation
 * @Description: 
 * @author dingw prestigeding@126.com
 * @date 2015年7月23日 下午4:33:29
 * @version V1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MybatisScan {

}
