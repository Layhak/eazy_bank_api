package co.istad.jbsdemo.eazybank.feature.notice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
    * This class is a controller class that handles the notice feature of the application.
    * It is a REST controller that listens to the /api/v1/bank/notice endpoint.
    * It returns a string "Notice" when the endpoint is hit.
    * The class is annotated with @RestController to indicate that it is a controller class.
    * The class is annotated with @RequestMapping("/api/v1/bank/") to specify the base URL for the controller.
    * The notice() method is annotated with @RequestMapping("/notice") to specify the endpoint for the notice feature.
    * The notice() method returns a string "Notice" when the endpoint is hit.
 */
@RestController
@RequestMapping("/api/v1/bank/")
public class NoticeController {
    @RequestMapping("/notice")
    public String notice() {
        return "Notice";
    }
}
