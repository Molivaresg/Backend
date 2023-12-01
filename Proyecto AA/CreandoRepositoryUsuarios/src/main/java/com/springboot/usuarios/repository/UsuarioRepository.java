package com.springboot.usuarios.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.springboot.usuarios.entity.User;

public interface UsuarioRepository extends PagingAndSortingRepository <User, Long> {
   
	public User findByUsername (String username);
	public User findByUseremail (String username);
	
	@Query (value = "select u from Usuario u where u.username = ?1")
	public User obtenerPorUsername (String username);
	
	@Query (value = "select u from Usuario u where u.username = ?1 and u.email =?2")
	public User obtenerPorUsernameYEmail (String username, String email);
	
	
}
