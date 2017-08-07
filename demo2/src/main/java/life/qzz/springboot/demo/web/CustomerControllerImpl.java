package life.qzz.springboot.demo.web;


import life.qzz.springboot.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControllerImpl implements CustomerController {
    @Autowired
    private CustomerService customerService;
    @Override
    @RequestMapping("customer")
    public Object getCustomer(String id) {
        return customerService.findCustomer(id);
    }
}
