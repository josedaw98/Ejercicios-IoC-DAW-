package com.jose.IoC.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jose.IoC.Interfaces.Almacenamiento;
@Component
@Qualifier("espana")
public class Espana implements Almacenamiento {

	@Override
	public float getIva() {
		
		return 21f;
	}

}
