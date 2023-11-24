package com.bocinas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bocinas.entity.Bocina;
import com.bocinas.service.BocinaService;
import java.util.List;

@RestController
public class BocinaController {

    @Autowired
    private BocinaService service;

    @GetMapping("/list")
    public List<Bocina> list(){
        return service.findAll();
    }
    
    @DeleteMapping("/bocina/{id}")
    public ResponseEntity<Void> drop(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping ("/bocina/")
    public ResponseEntity<Bocina> add (@RequestBody Bocina instance) {
        Bocina bocina = service.save(instance);
        return new ResponseEntity<>(bocina, HttpStatus.CREATED);
    }

    @PutMapping("/bocina/{id}")
    public ResponseEntity<Bocina> updateBocina(@PathVariable Long id, @RequestBody Bocina instance) {
        if(service.existById(id)){
        	instance.setId(id);
        	 Bocina bocina = service.save(instance); 
        return new ResponseEntity<>(bocina, HttpStatus.OK);
        } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}

