package kz.gitlab.G115thymeleaf.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homepage(Model model){
        var academicPerfomance = new HashMap<String, Integer>();
        academicPerfomance.put("A", 90);
        academicPerfomance.put("B", 75);
        academicPerfomance.put("C", 60);
        academicPerfomance.put("D", 50);
        model.addAttribute("ap", academicPerfomance);
        model.addAttribute("selectedAp", academicPerfomance.get("A"));
        return "home";
    }

    @GetMapping("/second-page")
    public String secondpage(){
        return "second-page";
    }

}
