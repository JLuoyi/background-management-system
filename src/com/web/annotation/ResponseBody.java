package com.web.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
// 注解的生效范围：只能应用在方法上面
@Target(ElementType.METHOD)
public @interface ResponseBody {

}
