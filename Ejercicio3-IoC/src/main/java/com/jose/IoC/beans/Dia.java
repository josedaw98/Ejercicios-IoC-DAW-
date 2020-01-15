package com.jose.IoC.beans;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Dia {

	
	private String fecha;
	
	
	
	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}




}
