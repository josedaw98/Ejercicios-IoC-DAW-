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
		
		Calendar hoy = Calendar.getInstance();
		int diaDeLaSemana = hoy.get(Calendar.DAY_OF_WEEK);
		int resta = 1 - diaDeLaSemana;//ponemos 1 por que el lunes es el dia dos y en nuestro metodo de dibujo al primera dia le sumamos uno
		diaDeHoy.add(Calendar.DATE, resta);
		int i=0;
		int x=0;
		while(x<2) {
			calendario+= "<tr><td>Lunes</td><td>martes</td><td>miercoles</td><td>jueves</td><td>viernes</td><td>sabado</td><td>domingo</td></tr>";
			calendario +="<tr>";
			while(i<7) {
				diaDeHoy.add(Calendar.DATE, 1);
				dia.setFecha(formato.format(diaDeHoy.getTime()));
				calendario +="<td>"+dia+"</td>";
				i++;
			}
			x++;
			i=0;
			calendario+="</tr>";
		}
		
		
		calendario += "</table>";
		return calendario;
		
	}
	
	
	
}
