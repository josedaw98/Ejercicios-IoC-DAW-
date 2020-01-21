package com.jose.IoC.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jose.IoC.beans.Dia;

@Component
public class DibujarCalendario {
	
	
	public List<Dia> rellenar(){
		
		List<Dia> Dias = new ArrayList<Dia>();
		
		Calendar diaDeHoy = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar hoy = Calendar.getInstance();
		int diaDeLaSemana = hoy.get(Calendar.DAY_OF_WEEK);
		int resta = (diaDeLaSemana==1)?-6:1 - diaDeLaSemana;//ponemos 1 por que el lunes es el dia dos y en nuestro metodo de dibujo al primera dia le sumamos uno
		diaDeHoy.add(Calendar.DATE, resta);
		
		for(int i=0;i<15;i++) {
			diaDeHoy.add(Calendar.DATE, 1);
			Dia dia = new Dia();
			dia.setFecha(formato.format(diaDeHoy.getTime()));
			Dias.add(dia);
			
		}
		 
		
		return Dias;
		
	}

	public String Dibujar(List<Dia> dias) {

		String calendario = "<table border='1'>";

		int cont = 0;
		Dia mostrar = dias.get(cont);

		for (int x = 0; x < 2; x++) {
			calendario += "<tr><td>Lunes</td><td>martes</td><td>miercoles</td><td>jueves</td><td>viernes</td><td>sabado</td><td>domingo</td></tr>";
			calendario += "<tr>";
			for (int i = 0; i < 7; i++) {
				calendario += "<td>" + mostrar + "</td>";
				cont++;
				mostrar = dias.get(cont);
			}

			calendario += "</tr>";
		}

		calendario += "</table>";
		return calendario;

	}
	
	
	
}
