package com.example.funfactgenerator.controller;

import com.example.funfactgenerator.service.FunFactService;
import com.example.funfactgenerator.service.FactResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FunFactController {

    @Autowired
    private FunFactService funFactService;

    private List<String> factHistory = new ArrayList<>();

    @GetMapping("/")
    public String showFunFact(Model model) {
        String fact = funFactService.getRandomFact();
        factHistory.add(fact); // Add fact to history
        model.addAttribute("fact", fact);
        model.addAttribute("factHistory", factHistory); // Pass history to template
        return "index";
    }

    @GetMapping("/new-fact")
    @ResponseBody
    public FactResponse getNewFact() {
        return funFactService.getRandomFactResponse();
    }
}
