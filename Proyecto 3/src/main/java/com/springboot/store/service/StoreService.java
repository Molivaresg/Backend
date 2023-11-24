package com.springboot.store.service;

import java.util.List;
import com.springboot.store.models.Store;

public interface StoreService {
   
	public List<Store> findAll();
	
	public Store findbyId(Long id, Integer cantidad);
}
