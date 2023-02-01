# 我的starter my-spring-boot-starter
## demo-spring-boot-starter说明：  
1. starter1：  &ensp;**\(通过单独配置扫描子jar的方式，独立于方式2和方式4\)**  

    &ensp;&ensp;&ensp;&ensp;直接在starter里面启动自动配置初始化配置类。但是这种不灵活，引入它的无法对里面的bean重写，重定义。  
    另外springboot默认是只加载启动类根目录下的包及其子包下的东西，如果要让引入的jar（starter）包里面被扫描到需要再配置@ComponentScan({"com.wwt.starter","com.wwt"})。  
    同时还要把本项目的目录也加进去，否则springboot只扫描子包。本地项目里面定义的controller全部失效，访问404.   
    方法：配置XxxAutoConfiguration + @ComponentScan 方式使用  
            
2. starter2：  &ensp;**\(2.7版本前配置spring.factories方式\)**  

    springboot2.7.0以前的方式新建starter。springboot2.7.0开始官方就不建议这种方式了。  
    方法： xxxautoConfiguratin + spring.factories文件中加入auto自动配置类。  
    
3. starter3：  &ensp;**\(通过@EnableXXX注解方式，独立于方式2和方式4\)**  

    &ensp;&ensp;&ensp;&ensp;通过注解方式开启starter，@Import(HellowordSelector.class) import注入选择器创建configration。打开注解就注入，不打开就不会注入该类。  
    注意，此时不能把Starter3AutoConfiguration.java自动化配置类配置进org.springframework.boot.autoconfigure.AutoConfiguration.imports中。  
    如果配置了就会加载进去，进行初始化了。因为本身通过@EnableStarter3的方式就已经加载进去了，里面有Starter3Selector.class加载处理。所以不需要配置imports文件中。  
    
    &ensp;&ensp;&ensp;&ensp;注解方式启动自动化配置，主类开启这个注解就自动配置，不开启就不自动配置。  
    使用了@EnableXXX方式就不需要使用加入imports文件的方式了，因为@EnableXXX方式本身就加入了注入初始化的代码。  
    
    **重点**：  
    &ensp;&ensp;&ensp;&ensp;springboot2.7.0版本开始就不推荐，其中有一项是改变原来的自动化配置注册方式；如果你之前写过相关starter类或者研究过自动化。  
    配置的源码知道，配置自动化配置类需要在META-INF/spring.factories文件中配置配置类，而最新版本是配置  
    META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports文件中配置，不过目前是**兼容两种配置模式共存**。  
    &ensp;&ensp;&ensp;&ensp;所以需要根据条件才能加载configration的auto类必须要加到imports文件中，否则都会自动扫描到并且自动创建加载。
    
4. starter4：  &ensp;**\(2.7版本后新方式\)**  
    org.springframework.boot.autoconfigure.AutoConfiguration.imports与spring.factories其实作用一样，只是做好不一样。最终的效果都是通过配置他们让配置类根据条件
    判断是否自动加载进去。  
    方法：imports + @AutoConfiguration  
    
5. starter5：  &ensp;**\(补充starter3方式\)**  
    使用ImportBeanDefinitionRegistrar方式直接注册bean到容器中的方式。  

6. starter6：  &ensp;**\(imports方式，测试@ConditionalOnMissingClass注解\)**  
    &ensp;&ensp;&ensp;&ensp;不要使用即将创建对象的类去做条件，否则永远不成立。要使用另外一个类去开启。

7. starter7：  &ensp;**\(imports方式，测试@ConditionalOnMissingBean注解\)**  &ensp;重要，常用!!!&ensp;  
   &ensp;&ensp;&ensp;&ensp;通常springboot的插件都是使用这种方式来创建默认的bean配置。  
   &ensp;&ensp;&ensp;&ensp;外部如果需要覆盖自定义配置，需要用@Configuration注解，不能使用@AutoConfiguration  

8. starter8：  &ensp;**\(imports方式，测试@ConditionalOnClass注解\)**  不常用  

9. starter9：  &ensp;**\(imports方式，测试@ConditionalOnProperty注解\)**  &ensp;重要，常用!!!&ensp;  
   &ensp;&ensp;&ensp;&ensp;指定参数的值符合要求时，配置才生效
    通过配置属性来启动配置，没有自动提示  
    直接配置属性的方式，这种方式没有自动提示

10. starter10：  &ensp;**\(imports方式，测试@ConditionalOnClass &ensp; + &ensp; 类注解&ensp;自动提示\)**  &ensp;重要，常用!!!&ensp;  
    &ensp;&ensp;&ensp;&ensp;指定参数的值符合要求时，配置才生效
    通过配置属性来启动配置，有自动提示  
    通过类来映射配置文件属性来做，这种方式可以配置自动提示  

11. 
    


## test-spring-boot-starter说明：  
  
&ensp;&ensp;**测试以上自定义starter**  

1. starter1测试  
&ensp;&ensp;&ensp;&ensp;测试通过自动化配置&ensp;+&ensp;扫描方式自定义starter

2. starter2测试  
&ensp;&ensp;&ensp;&ensp;测试通过spring.factories方式自定义starter  

3. starter3测试  
&ensp;&ensp;&ensp;&ensp;测试通过2.7版本后新方式（imports）自定义starter  

4. starter4测试  
&ensp;&ensp;&ensp;&ensp;测试通过补充starter3方式自定义starter  

5. starter5测试  
使用ImportBeanDefinitionRegistrar方式直接注册bean到容器中的方式。  

6. starter6测试  
&ensp;&ensp;&ensp;&ensp;不要使用即将创建对象的类去做条件，否则永远不成立。要使用另外一个类去开启。  

7. starter7测试  
   &ensp;&ensp;&ensp;&ensp;测试@ConditionalOnMissingBean注解。  

8. starter8测试  
   &ensp;&ensp;&ensp;&ensp;测试@ConditionalOnClass注解。  

9. starter9测试  
   &ensp;&ensp;&ensp;&ensp;测试@ConditionalOnProperty注解。  

10. starter10测试  
   &ensp;&ensp;&ensp;&ensp;测试@ConditionalOnProperty注解。  