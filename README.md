# 我的starter my-spring-boot-starter
## demo-spring-boot-starter说明： 
    1. starter1： 
        通过注解方式开启starter，@Import(HellowordSelector.class) import注入选择器创建configration。 
        打开注解就注入，不打开就不会注入该类。如果没打开注解而使用了该注解项目启动会报错，说找不到该类，因为没有注入。打开注解就会报错。
        重点： 
            springboot2.7.0版本开始就不推荐，其中有一项是改变原来的自动化配置注册方式；如果你之前写过相关starter类或者研究过自动化 
            配置的源码知道，配置自动化配置类需要在META-INF/spring.factories文件中配置配置类，而最新版本是配置 
            META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports文件中配置，不过目前是兼容两种配置模式共存。 
            所有需要根据条件才能加载configration的auto类必须要加到imports文件中，否则都会自动扫描到并且自动创建加载。 
    2. starter2 
    
## test-spring-boot-starter说明： 