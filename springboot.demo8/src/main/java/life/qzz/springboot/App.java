package life.qzz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(FooProperties.class)
 public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
