import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;

import com.jose.IoC.beans.Dia;
import com.jose.IoC.services.DibujarCalendario;

public class Pruebas {

	public static void main(String[] args) {
		Dia dia = new Dia();
		Calendar diaDeHoy = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		dia.setFecha(formato.format(diaDeHoy.getTime()));
		
		
		String calendario = "<table border='1'>";
		calendario += "<tr>";
		int i=0;
		while(i<21) {
			diaDeHoy.add(Calendar.DATE, 1);
			dia.setFecha(formato.format(diaDeHoy.getTime()));
			calendario +="<td>"+dia+"</td>";
			i++;
		}
		calendario += "</tr>";
		calendario += "</table>";


		System.out.println(calendario);
	}

}
