package life.qzz.springboot.demo.service;


import life.qzz.springboot.demo.domain.Customer;

public interface CustomerService {
    Customer findCustomer(String id);
}
