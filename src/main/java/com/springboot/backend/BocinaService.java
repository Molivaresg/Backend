package com.springboot.backend;

import java.util.List;

public interface BocinaService {
    List<Bocina> obtenerTodasLasBocinas();
    Bocina obtenerBocinaPorId(Long id);

}

