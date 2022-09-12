package com.example.Comcast.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/People")
public class PeopleController {

    @GetMapping()
    public String peopleLandingPage() {
        return "peopleLandingPage";
    }

    @GetMapping("/findAll")
    public String findAllWebPage() {
        return "findAllWebPage";
    }

    @GetMapping("/findID/{id}")
    public String findByIDWebPage(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "findByIDWebPage";
    }
}
