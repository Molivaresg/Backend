package com.springboot.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bocinas")
public class BocinaController {

    @Autowired
    private BocinaService bocinaService;

    @GetMapping("/")
    public List<Bocina> obtenerTodasLasBocinas() {
        return bocinaService.obtenerTodasLasBocinas();
    }

    @GetMapping("/{id}")
    public Bocina obtenerBocinaPorId(@PathVariable Long id) {
        return bocinaService.obtenerBocinaPorId(id);
    }
}
