package com.jose.IoC.servicio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jose.IoC.interfaces.Almacenamiento;

@Component
@Qualifier("profesor")
public class ConfiguracionProfesor implements Almacenamiento {


@Override
public String getPath() {
	// TODO Auto-generated method stub
	return "/ficheros/profesorado";
}

@Override
public float getStorage() {
	
	return 2;
}
	
}
