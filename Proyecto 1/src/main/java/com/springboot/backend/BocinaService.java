package com.springboot.backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BocinaService {
    private final BocinaRepository bocinaRepository;

    @Autowired
    public BocinaService(BocinaRepository bocinaRepository) {
        this.bocinaRepository = bocinaRepository;
    }

    // Crear una bocina
    public Bocina crearBocina(Bocina bocina) {
        return bocinaRepository.save(bocina);
    }

    // Buscar todas las bocinas
    public List<Bocina> obtenerTodasLasBocinas() {
        return bocinaRepository.findAll();
    }

    //Buscar una bocina por su ID
    public Optional<Bocina> obtenerBocinaPorId(Long id) {
        return bocinaRepository.findById(id);
    }


    // Eliminar una bocina por su ID
    public void eliminarBocina(Long id) {
        bocinaRepository.deleteById(id);
    }
}

