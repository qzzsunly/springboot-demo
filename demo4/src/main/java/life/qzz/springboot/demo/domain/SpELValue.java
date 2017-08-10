package life.qzz.springboot.demo.domain;


import org.springframework.stereotype.Component;

@Component
public class SpELValue {
//    @Value("${'hello' + 'word'}")
    private String uuid;

    @Override
    public String toString() {
        return "SpELValue{" +
                "uuid='" + uuid + '\'' +
                '}';
    }
}
