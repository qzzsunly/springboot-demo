package life.qzz.springboot.demo;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "life.qzz.springboot")
public class Config {

}
