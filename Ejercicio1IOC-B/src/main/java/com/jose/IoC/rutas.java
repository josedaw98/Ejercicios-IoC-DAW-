package com.jose.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jose.IoC.beans.Almacenamiento;

@Controller
public class rutas {

	@Autowired
	Almacenamiento profesor;
	
	@Autowired
	Almacenamiento alumno;

	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
				
		return "Profesorado: [" +  profesor.getRuta() + ", " + profesor.getAlmacenamiento() + "]<br> Alumnado: [" + alumno.getRuta() + ", " +  alumno.getAlmacenamiento() + "]";
		
	}
	
}
	

