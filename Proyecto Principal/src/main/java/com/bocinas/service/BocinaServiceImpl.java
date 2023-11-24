package com.bocinas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bocinas.entity.Bocina;
import com.bocinas.repository.BocinaDao;

@Service
public class BocinaServiceImpl implements BocinaService {

	@Autowired
	private BocinaDao bocinaDao;
	
	@Override
	public List<Bocina> findAll() {
		return (List<Bocina>) bocinaDao.findAll();
	}

	@Override
	public Bocina findById(Long id) {
		return bocinaDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		bocinaDao.deleteById(id);

	}

	@Override
	public Bocina save(Bocina instance) {
		return bocinaDao.save(instance);
	}

	@Override
	public boolean existById(Long id) {
		return bocinaDao.existsById(id);
	}

}
