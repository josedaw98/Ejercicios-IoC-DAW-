package com.jose.IoC.servicio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jose.IoC.interfaces.Almacenamiento;

@Component
@Qualifier("alumno")
public class ConfiguracionAlumno implements Almacenamiento {


@Override
public String getPath() {
	// TODO Auto-generated method stub
	return "/ficheros/alumnado";
}

@Override
public float getStorage() {
	// TODO Auto-generated method stub
	return (float) 0.1;
}
	
}
