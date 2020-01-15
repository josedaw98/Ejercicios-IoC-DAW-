package com.jose.IoC.beans;

import org.springframework.stereotype.Component;

@Component
public class Dia {

	
	private String fecha;
	
	
	
	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return "Dia [fecha=" + fecha + "]";
	}




}
