import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jose.IoC.beans.Dia;
import com.jose.IoC.services.DibujarCalendario;

public class Pruebas {

	public static void main(String[] args) {
		Dia dia = new Dia();
		List<Dia> Dias = new ArrayList<Dia>();
		
		Calendar diaDeHoy = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		dia.setFecha(formato.format(diaDeHoy.getTime()));
		
		Calendar hoy = Calendar.getInstance();
		int diaDeLaSemana = hoy.get(Calendar.DAY_OF_WEEK);
		int resta = 1 - diaDeLaSemana;//ponemos 1 por que el lunes es el dia dos y en nuestro metodo de dibujo al primera dia le sumamos uno
		diaDeHoy.add(Calendar.DATE, resta);
		
		for(int i=0;i<15;i++) {
			diaDeHoy.add(Calendar.DATE, 1);
			dia.setFecha(formato.format(diaDeHoy.getTime()));
			Dias.add(dia);
			for(int x =0 ; x<Dias.size();x++) {
				System.out.print("--"+Dias.get(x).getFecha()+"---");
			}
			System.out.println(" ");
		}
		/*
		int cont=0;
		Dia mostrar = Dias.get(cont);
		
		for(int i=0;i<14;i++) {
			
			System.out.println(mostrar.getFecha());
			cont++;
			dia = Dias.get(cont);
		}*/
	}

}
