package com.wwt.demo.starter.starter5;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author wwt
 * @ClassName EnableStarter5.java
 * @Description TODO
 * @CreateTime 2023-01-15 22:13
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(Starter5ImportBeanDefinitionRegistrar.class)
public @interface EnableStarter5 {

    /***
     * 为true时导入HellowordConfiguration.class，为false时不导入HellowordConfiguration.class
     * @return
     */
    boolean enabled() default true;
}
