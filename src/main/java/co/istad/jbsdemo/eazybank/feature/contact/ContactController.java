package co.istad.jbsdemo.eazybank.feature.contact;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bank/")
public class ContactController {
    @RequestMapping("/contact")
    public String contact() {
        return "Contact";
    }
}
