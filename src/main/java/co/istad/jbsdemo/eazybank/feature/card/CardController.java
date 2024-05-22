package co.istad.jbsdemo.eazybank.feature.card;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bank/")
public class CardController {
    @GetMapping("/myCards")
    public String getMyCards() {
        return "My Cards";
    }
}
