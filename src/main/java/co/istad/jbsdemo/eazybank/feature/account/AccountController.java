package co.istad.jbsdemo.eazybank.feature.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bank/")
public class AccountController {
    @GetMapping("/myAccount")
    public String getMyAccount() {
        return "My Account";
    }
}
