package com.example.Comcast.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import com.example.Comcast.Entity.People;
import com.example.Comcast.Repository.PeopleRepository;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/People")
public class APIController {

    /* Lack of Database... need to hard code the People Entity instead of the usual PeopleRepository using CRUD*/
    PeopleRepository repo = new PeopleRepository();
    List<People> indx = repo.init_repo();

    @GetMapping("/api/findID/{id}") 
    public People findID(@PathVariable String id) {
        People p = repo.findByID(indx, id);

        if(p == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return p;
    }

    @GetMapping("/api/findAll")
    public List<People> findAll() {
        return indx;
    }
}
