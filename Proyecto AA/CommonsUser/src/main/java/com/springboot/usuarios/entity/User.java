package com.springboot.usuarios.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="usuarios")
public class User implements Serializable{

	private static final long serialVersionUID = 2442000501703259933L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, length = 20)
	private String username;
	
	
	@Column(unique = true, length = 100)
	private String email;
	
	
	@Column(unique = true, length = 60)
	private String password;
	
	private Boolean enabled;
	
	private String nombre;
	
	private String apellido;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable (name = "usuarios_to_roles", joinColumns = @JoinColumn (name = "user_id"), inverseJoinColumns = @JoinColumn (name = "rooles_id"),
	           uniqueConstraints = {@UniqueConstraint (columnNames = {"user_id", "rooles_id"})})

    private List<Role> roles;
    
	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}