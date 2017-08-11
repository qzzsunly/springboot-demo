package life.qzz.springboot.demo5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean {
    @Value("${name}")
    private String name;

    @PostConstruct
    public void print(){
        System.out.println("属性值：" + name);
    }
}
