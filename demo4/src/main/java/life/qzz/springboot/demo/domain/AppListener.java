package life.qzz.springboot.demo.domain;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class AppListener implements ApplicationListener<ContextRefreshedEvent> {
    private Logger logger = LoggerFactory.getLogger(AppListener.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        MyBean bean = contextRefreshedEvent.getApplicationContext().getBean(MyBean.class);
        logger.debug("属性值: {}" , bean.getName());

        logger.debug("random value: {}",contextRefreshedEvent.getApplicationContext().getBean(RandomValue.class));
        logger.debug("spel value: {}",contextRefreshedEvent.getApplicationContext().getBean(SpELValue.class));
    }
}
