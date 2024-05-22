package co.istad.jbsdemo.eazybank.feature.authority;

import co.istad.jbsdemo.eazybank.entity.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authorities, Long> {

}
