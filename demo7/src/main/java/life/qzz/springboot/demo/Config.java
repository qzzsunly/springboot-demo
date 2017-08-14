package life.qzz.springboot.demo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="my")
public class Config{
    private List<String> servers = new ArrayList<>();

    public List<String> getServers(){
        return servers;
    }

    @PostConstruct
    public void print(){
        System.out.println("属性: " + servers);
    }
}