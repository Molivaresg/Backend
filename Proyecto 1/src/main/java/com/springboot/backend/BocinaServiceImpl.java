package com.springboot.backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BocinaServiceImpl implements BocinaService {
    private final BocinaRepository bocinaRepository;

    @Autowired
    public BocinaServiceImpl(BocinaRepository bocinaRepository) {
        this.bocinaRepository = bocinaRepository;
    }

    @Override
    public Bocina crearBocina(Bocina bocina) {
        return bocinaRepository.save(bocina);
    }

    @Override
    public List<Bocina> obtenerTodasLasBocinas() {
        return bocinaRepository.findAll();
    }

    @Override
    public Optional<Bocina> obtenerBocinaPorId(Long id) {
        return bocinaRepository.findById(id);
    }

    @Override
    public void eliminarBocina(Long id) {
        bocinaRepository.deleteById(id);
    }
}

