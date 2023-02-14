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

    @RequestMapping("sourcesolomon")
    public String gotoSource1() {
        return "redirect:https://pixabay.com/vectors/seal-signs-symbols-solomon-40410/";
    }

    @RequestMapping("sourcecomputer")
    public String gotoSource2() {
        return "redirect:https://www.compufinupt.co.za/products-services/personal-computer-hardware-servers-software/";
    }

    @RequestMapping("sourcemedia")
    public String gotoSource3() {
        return "redirect:https://www.whatmobile.net/Features/article/5-little-known-social-media-marketing-tips-that-will-take-your-marketing-to-new-heights";
    }
}