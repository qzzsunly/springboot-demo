package life.qzz.springboot;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.SocketUtils;

@ConfigurationProperties("foo")
public class FooProperties{

    private final List<MyPojo> list = new ArrayList<>();

    public List<MyPojo> getList(){
        return this.list;
    }

    @PostConstruct
    public void print(){
        System.out.println(list);
    }

}