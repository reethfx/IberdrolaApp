package com.reeth.projectiberdrola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.reeth.projectiberdrola.model.Asociation;
import com.reeth.projectiberdrola.service.AsociationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/asociation")
public class AsociationController {
    
        @Autowired
    private AsociationService service;

       @GetMapping
    public List<Asociation> getInfo() {
        return service.getInfo();
    }
    
}
