package springboot.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/hello")
    public String showHelloWorld(){
        return "hello-world";
    }
}
