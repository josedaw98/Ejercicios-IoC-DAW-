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
		calendario += "<tr>";
		for(int i =0 ; i<21 ;i++) {
			diaDeHoy.add(Calendar.DATE, 1);
			
			calendario +="<td>"+diaDeHoy+"</td>";
		}
		calendario += "</tr>";
		calendario += "</table>";
		return calendario;
		
	}
	
}
