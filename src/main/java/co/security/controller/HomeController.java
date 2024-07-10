package co.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/home")
public class HomeController {
    
    @GetMapping("/no-secured")
    public String noSecured() {
        return "endpoint no seguro";
    }

    @GetMapping("/secured")
    public String secured() {
        return "endpoint seguro";
    }
}
