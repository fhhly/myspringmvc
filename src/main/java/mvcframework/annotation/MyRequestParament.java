package mvcframework.annotation;

import java.lang.annotation.*;

/**
 * 功能描述：（）
 *
 * @author: biubiubiu小浩
 * @date: 2019-01-03 21:40
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParament {
	String value() default "";
}
