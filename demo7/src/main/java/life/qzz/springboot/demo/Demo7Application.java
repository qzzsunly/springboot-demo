package life.qzz.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class Demo7Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo7Application.class, args);
	}
}
