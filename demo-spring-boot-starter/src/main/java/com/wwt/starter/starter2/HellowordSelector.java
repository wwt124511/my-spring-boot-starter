package com.wwt.starter.starter2;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @Author wwt
 * @ClassName HellowordSelector.java
 * @Description TODO
 * @CreateTime 2023-01-11 14:17
 */
public class HellowordSelector implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(EnableHelloword.class.getName());
        boolean enabled = (boolean) attributes.get("enabled");
        if(enabled){
            return new String[]{HellowordConfiguration.class.getName()};
        }else{
            return new String[]{};
        }
    }
}
