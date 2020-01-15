package com.jose.IoC.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {

	@Bean
	public Almacenamiento profesor() {
		
		Almacenamiento profesor = new Almacenamiento();
		profesor.setAlmacenamiento(2);
		profesor.setRuta("/ficheros/profesorado");
		
		return profesor;
	}
	
	@Bean
	public Almacenamiento alumno() {
		
		Almacenamiento alumno = new Almacenamiento();
		alumno.setAlmacenamiento(1);
		alumno.setRuta("/ficheros/alumnado");
		
		return alumno;
	}

}
	

