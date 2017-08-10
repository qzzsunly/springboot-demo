package life.qzz.springboot.demo.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomValue {
    @Value("${my.secret}")
    private String secret;
    @Value("${my.number}")
    private String number;
    @Value("${my.bignumber}")
    private String bignumber;
    @Value("${my.uuid}")
    private String uuid;
    @Value("${my.number.less.than.ten}")
    private String numberLessThanTen;
    @Value("${my.number.in.range}")
    private String numberInRange;

    @Override
    public String toString() {
        return "RandomValue{" +
                "secret='" + secret + '\'' +
                ", number='" + number + '\'' +
                ", bignumber='" + bignumber + '\'' +
                ", uuid='" + uuid + '\'' +
                ", numberLessThanTen='" + numberLessThanTen + '\'' +
                ", numberInRange='" + numberInRange + '\'' +
                '}';
    }
}
