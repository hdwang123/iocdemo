package com.hdwang.ioc.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Bean对象注解
 * 待存入ioc容器的相关对象，声明在具体的实现类上
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface MyBean {

    /**
     * 待存入ioc容器的Bean名称，为空时仅根据类型存Bean
     *
     * @return Bean名称
     */
    String value() default "";
}
