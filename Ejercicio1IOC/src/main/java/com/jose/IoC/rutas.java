package com.jose.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jose.IoC.interfaces.Almacenamiento;
import com.jose.IoC.servicio.ConfiguracionAlumno;
import com.jose.IoC.servicio.ConfiguracionProfesor;

@Controller
public class rutas {
	
	
	@Autowired
	@Qualifier("profesor")
	Almacenamiento profesor;
	
	@Autowired
	@Qualifier("alumno")
	Almacenamiento alumno;

	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		
		
		return "configuracion alumno: " + "<br>" +"Ruta: " +alumno.getPath() +"<br>"+"tamaño: "+alumno.getStorage() +"<br>"+"<br>"+"<br>"
				+ "configuracion Profesor: " +"<br>"+ "Ruta: " +profesor.getPath() +"<br>"+"tamaño: "+profesor.getStorage();
		
}
	
}
