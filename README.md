# 我的starter my-spring-boot-starter
## demo-spring-boot-starter说明：  
1. starter1：  &ensp;&ensp;**\(直接配置自动话加载方式\)**  

    &ensp;&ensp;&ensp;&ensp;直接在starter里面启动自动配置初始化配置类。但是这种不灵活，引入它的无法对里面的bean重写，重定义。  
    另外springboot默认是只加载启动类根目录下的包及其子包下的东西，如果要让引入的jar（starter）包里面被扫描到需要再配置@ComponentScan({"com.wwt.starter","com.wwt"})。  
    同时还要把本项目的目录也加进去，否则springboot只扫描子包。本地项目里面定义的controller全部失效，访问404.   
    方法：配置XxxAutoConfiguration + @ComponentScan 方式使用  
            
2. starter2  &ensp;&ensp;**\(2.7版本前配置spring.factories方式\)**  

    springboot2.7.0以前的方式新建starter。springboot2.7.0开始官方就不建议这种方式了。  
    方法： xxxautoConfiguratin + spring.factories文件中加入auto自动配置类。  
    
3. starter3  &ensp;&ensp;**\(2.7版本后新方式\)**  

    &ensp;&ensp;&ensp;&ensp;通过注解方式开启starter，@Import(HellowordSelector.class) import注入选择器创建configration。打开注解就注入，不打开就不会注入该类。  
    如果没打开注解而使用了该注解项目启动会报错，说找不到该类，因为没有注入。打开注解就会报错。  
      
    **重点**：  
    &ensp;&ensp;&ensp;&ensp;springboot2.7.0版本开始就不推荐，其中有一项是改变原来的自动化配置注册方式；如果你之前写过相关starter类或者研究过自动化。  
    配置的源码知道，配置自动化配置类需要在META-INF/spring.factories文件中配置配置类，而最新版本是配置  
    META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports文件中配置，不过目前是**兼容两种配置模式共存**。  
    &ensp;&ensp;&ensp;&ensp;所以需要根据条件才能加载configration的auto类必须要加到imports文件中，否则都会自动扫描到并且自动创建加载。
    
## test-spring-boot-starter说明：  
  
1. starter1测试  

2. starter2测试  