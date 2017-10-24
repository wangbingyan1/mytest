package cn.itheima.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //这个注解相当于@ResponseBody和controller的俩个注解结合体 ,配置在类上,说明这个类里的所有方法返回值都是以json格式返回的
public class HelloController {
	
	//获取application.properties文件中的所有属性(配置一个环境对象)
	@Autowired
	//private Environment environment;
	
	//上面的是获取全部属性,一线配置方式是单个的获取属性文件中的属性
	@Value("${name}")  //使用的是占位符,这个私有的属性名是可以乱写的,唯一起作用的,就是value中的属性名一定要和属性文件中的一致
	private String name;
	@Value("${url}")
	private String url;
	@GetMapping("hello") // 这个注解就相当于RequestMapping的注解 加上里面的注解指定方法为get
	//@RequestMapping(value="hello",method={RequestMethod.GET})
	public String hello(){
		
		//System.out.println("name: "+environment.getProperty("name"));
		//System.out.println("url: "+environment.getProperty("url"));
		
		System.out.println(name);
		System.out.println(url);
		//开启热部署,只需要在pom.xml文件中配置 devtools这个依赖就可以了.热部署的作用就是
		//为了节省我们的时间,每当我们改变代码后,保存时就会自动重启服务器
		return "hello spring boot!222222";
	}
}
