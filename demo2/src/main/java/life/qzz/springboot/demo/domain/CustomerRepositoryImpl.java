package life.qzz.springboot.demo.domain;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomer(String id) {
        return new Customer();
    }
}
