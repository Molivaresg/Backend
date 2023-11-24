package com.bocinas.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bocinas.entity.Bocina;

@Repository
public interface BocinaDao extends CrudRepository<Bocina, Long> {

}

