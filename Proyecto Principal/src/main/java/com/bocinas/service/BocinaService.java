package com.bocinas.service;

import java.util.List;

import com.bocinas.entity.Bocina;


public interface BocinaService {

   public List<Bocina> findAll();

   public Bocina findById(Long id);

   public void deleteById(Long id);
   
   public Bocina save (Bocina instance);
   
   public boolean existById(Long id);

}

