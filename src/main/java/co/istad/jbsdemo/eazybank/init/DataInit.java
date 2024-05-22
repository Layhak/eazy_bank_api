package co.istad.jbsdemo.eazybank.init;

import co.istad.jbsdemo.eazybank.entity.Authorities;
import co.istad.jbsdemo.eazybank.entity.User;
import co.istad.jbsdemo.eazybank.feature.authority.AuthorityRepository;
import co.istad.jbsdemo.eazybank.feature.user.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class DataInit {
    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;

    // populate database ( role with some data )
    @PostConstruct
    void dataInit() {
        authorityInit();
        userInit();
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

}

