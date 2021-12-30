package com.example.hostel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping
    public String navigateToMainPage(Model model) {
        return "welcome";
    }

    @GetMapping("/report")
    public String navigateToReportPage(Model model) {
        return "report";
    }

    @GetMapping("/resident")
    public String navigateToResidentPage(Model model) {
        return "resident";
    }

}
