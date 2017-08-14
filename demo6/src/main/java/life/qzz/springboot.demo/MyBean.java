package life.qzz.springboot.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean {
    private Logger logger = LoggerFactory.getLogger(MyBean.class);
    @Value("${name}")
    private String name;

    @PostConstruct
    public void print(){
        logger.debug("属性值：{}", name);
    }
}
