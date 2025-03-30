package com.example.controller;

import com.example.gridmanager.Service.GridmanagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GridController {

   @Autowired
    private GridmanagerService gridManager;

    @GetMapping("/echipa")
    public String showTeamsPage(Model model) {
        model.addAttribute("echipa", gridManager.getEchipe());
        return "echipa"; // Thymeleaf va căuta echipa.html
    }
}
