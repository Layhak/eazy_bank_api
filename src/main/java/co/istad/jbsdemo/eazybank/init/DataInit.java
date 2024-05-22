package co.istad.jbsdemo.eazybank.init;

import co.istad.jbsdemo.eazybank.entity.Authorities;
import co.istad.jbsdemo.eazybank.entity.Customer;
import co.istad.jbsdemo.eazybank.entity.User;
import co.istad.jbsdemo.eazybank.feature.authority.AuthorityRepository;
import co.istad.jbsdemo.eazybank.feature.customer.CustomerRepository;
import co.istad.jbsdemo.eazybank.feature.user.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class DataInit {
    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;
    private final CustomerRepository customerRepository;

    // populate database ( role with some data )
    @PostConstruct
    void dataInit() {
        authorityInit();
        userInit();
        customerInit();
    }
    void authorityInit() {
        if (authorityRepository.findAll().isEmpty()) {
            Authorities authority = new Authorities();
            authority.setUsername("admin");
            authority.setAuthority("WRITE");
            authorityRepository.save(authority);
        }
    }

    void userInit() {
        if (userRepository.findAll().isEmpty()) {
            // add user
            User user = new User();
            user.setUsername("admin");
            user.setPassword("admin");
            user.setEnabled(true);
            userRepository.save(user);
        }
    }
    void customerInit() {
        if (customerRepository.findAll().isEmpty()) {
            // add customer
            Customer customer = new Customer();
            customer.setEmail("customer@gmail.com");
            customer.setPassword("customer");
            customer.setRole("user");
            customerRepository.save(customer);
        }
    }

}

