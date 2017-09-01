package life.qzz;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class MyBean {
    private Logger logger = LoggerFactory.getLogger(MyBean.class);
    private final JmsTemplate jmsTemplate;

    @Autowired
    public MyBean(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String msg){
        jmsTemplate.convertAndSend("demo", msg);
    }

    @JmsListener(destination = "demo")
    public void processMessage(String content) throws JMSException {
        logger.debug("msg: {}", content);
    }
}
