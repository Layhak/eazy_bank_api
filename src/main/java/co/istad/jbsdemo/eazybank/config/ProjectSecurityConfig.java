package co.istad.jbsdemo.eazybank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(
                        (request) -> request
                                .requestMatchers("/api/v1/bank/myAccount",
                                        "api/v1/bank/myBalance",
                                        "api/v1/bank/myCards",
                                        "api/v1/bank/myLoan").authenticated()
                                .requestMatchers(
                                        "api/v1/bank/contact",
                                        "/api/v1/bank/notice").permitAll())
                .formLogin(withDefaults()).
                httpBasic(withDefaults()).build();
    }

}
