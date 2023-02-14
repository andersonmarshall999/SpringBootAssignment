package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showMain() {
        return "/index";
    }

    @RequestMapping("step1")
    public String showStep1() {
        return "/steps/step1";
    }

    @RequestMapping("step2")
    public String showStep2() {
        return "/steps/step2";
    }

    @RequestMapping("step3")
    public String showStep3() {
        return "/steps/step3";
    }
}