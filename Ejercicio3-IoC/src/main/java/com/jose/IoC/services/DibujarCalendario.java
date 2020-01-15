package com.jose.IoC.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Component;

import com.jose.IoC.beans.Dia;

@Component
public class DibujarCalendario {

	public String Dibujar(Dia dia) {
		
		Calendar diaDeHoy = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		dia.setFecha(formato.format(diaDeHoy.getTime()));
		
		
		String calendario = "<table border='1'>";
		
		int i=0;
		while(i<21) {
			diaDeHoy.add(Calendar.DATE, 1);
			dia.setFecha(formato.format(diaDeHoy.getTime()));
			calendario +="<tr><td>"+dia+"</td></tr>";
			i++;
		}
		
		calendario += "</table>";
		return calendario;
		
	}
	
}
