package com.springboot.backend;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BocinaServiceImpl implements BocinaService {

    @Autowired
    private BocinaRepository bocinaRepository;

    @Override
    public List<Bocina> obtenerTodasLasBocinas() {
        return bocinaRepository.findAll();
    }

    @Override
    public Bocina obtenerBocinaPorId(Long id) {
        return bocinaRepository.findById(id).orElse(null);
    }
}

