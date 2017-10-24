package cn.itheima.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 创建Application启动类：
 */
@SpringBootApplication   //代表为springBoot的应用的运行主类 ,把普通的Java类转成springBOOT的启动类
public class Application {
	public static void main(String[] args) {
		//运行的springBoot应用(第一种方式)
		//SpringApplication.run(Application.class, args);
		
		//第二种方法:就是去掉我们的广告内容图形
		SpringApplication application = new SpringApplication(Application.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
		
	}
}
