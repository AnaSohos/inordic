package com.classwork.lesson20.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping(path = "/index.html")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }

    @PostMapping(path = "/calculator.html")
    public String calculator(
            @RequestParam(name = "firstValue", required = false, defaultValue = "") String firstValue,
            @RequestParam(name = "secondValue", required = false, defaultValue = "") String secondValue,
            Model model
    ) {
        return "calculator";
    }
}
