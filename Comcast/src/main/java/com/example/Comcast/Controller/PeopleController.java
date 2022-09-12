package com.example.Comcast.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Comcast.Entity.People;
import com.example.Comcast.Repository.PeopleRepository;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/People")

public class PeopleController {
    // lack of database --> no CRUDREPO --> need to make a local db? List? ArrayList?
    PeopleRepository repo =new PeopleRepository();
    List<People> indx = repo.init_repo();
    
    
    @GetMapping("/findID/{id}") 
    public People findID(@PathVariable String id) {
        return repo.findByID(idx, id);
    }

    @GetMapping("/findAll") 
    public List<People> findAll() {
        return indx;
    }

    @GetMapping()
    public String landingPage() {
        return "Hello! This is Andy Lam's simple demonstration of a Srping API.";
    }

    @GetMapping("/htmlPageFindID")
    public String findID_html {
        return "findID_html"
    }

    @GetMapping("/htmlPageFindAll")
    public String findAll_html {
        return "findAll_html"
    }



    
}