package com.jose.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jose.IoC.beans.Dia;
import com.jose.IoC.services.DibujarCalendario;

@Controller
public class Rutas {
	
	
	
	@Autowired
	DibujarCalendario dibujar;
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
				
		return dibujar.Dibujar(dibujar.rellenar());
		
	}

}
