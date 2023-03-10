package com.wwt.demo.starter.starter3;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author wwt
 * @ClassName EnableStarter3.java
 * @Description TODO
 * @CreateTime 2023-01-11 14:11
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(Starter3Selector.class)
public @interface EnableStarter3 {

    /***
     * 为true时导入HellowordConfiguration.class，为false时不导入HellowordConfiguration.class
     * @return
     */
    boolean enabled() default true;

}
