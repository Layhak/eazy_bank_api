package co.istad.jbsdemo.eazybank.feature.loan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bank/")
public class LoanController {
    @RequestMapping("/myLoan")
    public String getMyLoan() {
        return "My Loan";
    }
}
