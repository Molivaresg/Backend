package com.springboot.store.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.springboot.store.models.Bocina;
import com.springboot.store.models.Store;


@Service
public class StoreServiceRestImpl implements StoreService {
	
	@Autowired
	private RestTemplate clientRest;

	@Override
	public List<Store> findAll() {
	   List<Bocina> bocinas=Arrays.asList(clientRest.getForObject("http://localhost:8081/list", Bocina[].class));
		return bocinas.stream().map(c->new Store (c,2)).collect(Collectors.toList());
	}

	@Override
	public Store findbyId(Long id, Integer cantidad) throws RestClientException {
		Map<String,String> pathVariables = new HashMap<>();
		pathVariables.put("id",id.toString());
		Bocina bocina = clientRest.getForObject("http://localhost:8081/bocina/{id}",Bocina.class, pathVariables);
		return new Store(bocina, cantidad);
		
	}

}
