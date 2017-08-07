package life.qzz.springboot.demo.service.impl;

import life.qzz.springboot.demo.domain.Customer;
import life.qzz.springboot.demo.domain.CustomerRepository;
import life.qzz.springboot.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer findCustomer(String id) {
        return customerRepository.findCustomer(id);
    }
}
