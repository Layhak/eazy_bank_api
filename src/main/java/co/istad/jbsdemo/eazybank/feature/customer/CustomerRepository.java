package co.istad.jbsdemo.eazybank.feature.customer;

import co.istad.jbsdemo.eazybank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByEmail(String username);
}
