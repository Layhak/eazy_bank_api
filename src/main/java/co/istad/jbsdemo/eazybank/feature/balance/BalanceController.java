package co.istad.jbsdemo.eazybank.feature.balance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bank/")
public class BalanceController {

    @GetMapping("/myBalance")
    public String getMyBalance() {
        return "My Balance";
    }

}
