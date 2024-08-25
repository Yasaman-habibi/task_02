package ir.freeland.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleController {

    
    @PostMapping("/registerHabibi")
    public String showRegisterHabibi() {
        return "registerHabibi";
    }
    
    @PostMapping("/resultHabibi")
    public String showResultHabibi() {
        return "resultHabibi";
    }
}
