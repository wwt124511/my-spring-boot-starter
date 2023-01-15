package com.wwt.starter.starter3;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @Author wwt
 * @ClassName Starter3Selector.java
 * @Description TODO
 * @CreateTime 2023-01-11 14:17
 */
public class Starter3Selector implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(EnableStarter3.class.getName());
        boolean enabled = (boolean) attributes.get("enabled");
        if(enabled){
            return new String[]{Starter3AutoConfiguration.class.getName()};
        }else{
            return new String[]{};
        }
    }
}
