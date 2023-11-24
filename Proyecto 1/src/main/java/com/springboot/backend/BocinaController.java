package com.springboot.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bocinas")
public class BocinaController {
    private final BocinaService bocinaService;

    @Autowired
    public BocinaController(BocinaService bocinaService) {
        this.bocinaService = bocinaService;
    }

    // Crear una bocina
    @PostMapping
    public Bocina crearBocina(@RequestBody Bocina bocina) {
        return bocinaService.crearBocina(bocina);
    }

    // Obtener todas las bocinas
    @GetMapping
    public List<Bocina> obtenerTodasLasBocinas() {
        return bocinaService.obtenerTodasLasBocinas();
    }

    // Obtener una bocina por su ID
    @GetMapping("/{id}")
    public Optional<Bocina> obtenerBocinaPorId(@PathVariable Long id) {
        return bocinaService.obtenerBocinaPorId(id);
    }

    // Eliminar una bocina por su ID
    @DeleteMapping("/{id}")
    public void eliminarBocina(@PathVariable Long id) {
        bocinaService.eliminarBocina(id);
    }
}


