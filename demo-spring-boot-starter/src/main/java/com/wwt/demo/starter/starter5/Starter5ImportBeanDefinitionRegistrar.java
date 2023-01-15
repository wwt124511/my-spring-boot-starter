package com.wwt.demo.starter.starter5;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @Author wwt
 * @ClassName Starter5ImportBeanDefinitionRegistrar.java
 * @Description ImportBeanDefinitionRegistrar可以直接注册BeanDefinition
 * @CreateTime 2023-01-15 22:14
 */
public class Starter5ImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(EnableStarter5.class.getName());
        boolean enabled = (boolean) attributes.get("enabled");
        if (enabled) {
            registry.registerBeanDefinition("starter5Service", new RootBeanDefinition(Starter5Service.class));
        }
    }
}
