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
    List<People> idx = new ArrayList<People>();
    PeopleRepository repo =new PeopleRepository();
    
    @GetMapping("/findID/{id}") 
    public People findID(@PathVariable String id) {
        return repo.findByID(idx, id);
    }

    @GetMapping() 
    public List<People> findAll() {
        return idx;
    }
}