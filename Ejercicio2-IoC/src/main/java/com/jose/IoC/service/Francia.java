package com.jose.IoC.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jose.IoC.Interfaces.Almacenamiento;
@Component
@Qualifier("francia")
public class Francia implements Almacenamiento {

	@Override
	public float getIva() {
		
		return  25f;
	}

}
