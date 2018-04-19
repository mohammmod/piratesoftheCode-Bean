package at.refugeecode.mp15piratesofthecodebean.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class Pirates {
    private boolean foundMermaid;
    private boolean gotTheTears;
    private boolean foundChallice;
    private boolean drinkThetear;

    @ModelAttribute("foundMermaid")
    public boolean isFoundMermaid() {
        return foundMermaid;
    }

    @ModelAttribute("gotTheTears")
    public boolean isGotTheTears() {
        return gotTheTears;
    }
    @ModelAttribute("foundChallice")
    public boolean foundChallice(){
        return foundChallice;
    }
    @ModelAttribute("drinkThetear")
    public boolean drinkingTear(){
        return drinkThetear;
    }
    @GetMapping
    public String get() {
        foundMermaid = true;
        return "home";
    }

    @GetMapping("/tears")
    String tears() {
        gotTheTears = true;
        return "redirect:/";
    }

    @GetMapping("/challice")
    String challice(){
        foundChallice = true;
        return "redirect:/";
    }
    @GetMapping("/drink")
    String drinkTears(){
        drinkThetear = true;
        return "redirect:/";
    }



}
