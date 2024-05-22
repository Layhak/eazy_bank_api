package co.istad.jbsdemo.eazybank.feature.user;

import co.istad.jbsdemo.eazybank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
