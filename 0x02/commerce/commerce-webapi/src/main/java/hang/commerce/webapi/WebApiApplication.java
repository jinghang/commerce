package hang.commerce.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring boot 应用入口
 */
@ComponentScan(value = "hang.commerce") // 依赖注入扫描
@SpringBootApplication
public class WebApiApplication {
	public static void main(String[] args){
		SpringApplication.run(WebApiApplication.class, args);
	}
}
