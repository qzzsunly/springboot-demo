package life.qzz.springboot.demo.domain;


public interface CustomerRepository {
    Customer findCustomer(String id);
}
