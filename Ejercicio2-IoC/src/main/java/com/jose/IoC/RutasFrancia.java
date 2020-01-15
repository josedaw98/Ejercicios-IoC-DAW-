package com.jose.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jose.IoC.Interfaces.Almacenamiento;

@Controller
public class RutasFrancia {

	@Autowired
	@Qualifier("francia")
	Almacenamiento almacenamiento;
	
	@ResponseBody
	@GetMapping("/precio/francia/{cantidad}")
		public float PrecioFinal(@PathVariable float cantidad) {
		   
			
			return cantidad*((almacenamiento.getIva()/100)+1);
		
	}
	
}
