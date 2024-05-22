package co.istad.jbsdemo.eazybank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
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
    //Only for testing
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .authorities("ADMIN")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("user")
                .authorities("USER")
                .build();
        return new InMemoryUserDetailsManager(admin, user);
    }

}
