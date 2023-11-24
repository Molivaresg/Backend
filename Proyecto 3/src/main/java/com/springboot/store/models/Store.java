package com.springboot.store.models;

public class Store {
	
	private Bocina bocina;
	
	private Integer cantidad;

	public Store( ) {

	}
	
	public Store(Bocina bocina, Integer cantidad) {
		super();
		this.bocina = bocina;
		this.cantidad = cantidad;
	}

	public Bocina getBocina() {
		return bocina;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setBocina(Bocina bocina) {
		this.bocina = bocina;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	

}
