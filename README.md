# IoC_Ejercicios
Primeros ejercicios con IoC utilizando las nuevas etiquetas Beans y Services

## Ejercicio 1
Disponer de clases, objetos y anotaciones para poder hacer uso de los elementos de configuración de una aplicación, siguiendo la siguiente información:
1. Los profesores van a poder disponer de 2GB de espacio de almacenamiento y su ruta es /ficheros/profesorado
2. Los alumnos van a poder disponer de 0,1GB de almacenamiento y su ruta es /ficheros/alumnado
3. Comprueba a partir de la ruta / mediante Sysos o @ResponseBody los almacenamientos y rutas de ambas configuraciones.

## Ejercicio 2
Disponer de clases, objetos y anotaciones para poder hacer uso de los elementos de configuración de una aplicación, siguiendo la siguiente información:
1. El IVA en Francia es del 25% y en España del 21%
2. Escribir una ruta del tipo /precio/francia/{cantidad} devuelva como @ResponseBody el precio mas IVA correspondiente a este país, Francia.
3. Escribir una ruta del tipo /precio/espana/{cantidad} devuelva como @ResponseBody el precio mas IVA correspondiente a este país, España.

## Ejercicio 3
Crear los 21 siguientes a la fecha actual y devolver a una vista, cada uno de esos días, en un objeto de un vector que contenga elementos de la clase día. Recorre el vector y muéstralo en la lista.

| Dia   | Dia  |  ........................ | Dia |
| ---   | ---  | ---  | --- |

```java
public class Dia {
  private String fecha;
}
```

Un resumen de las operaciones de java que permiten realizar operaciones con fechas son las siguientes:

```java
Dia dia = new Dia();
Calendar diaDeHoy = Calendar.getInstance();
SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
dia.setFecha(formato.format(diaDeHoy.getTime()));
```
Esas operaciones permiten colocar en el objeto dia un String correspondiente al día de hoy en el formato dia/mes/año.

Esta operación:

```java
diaDeHoy.add(Calendar.DATE, 1);
```

permite añadir un día a la fecha que haya en el objeto diaDeHoy. De esta misma manera se podrían restar días (con -1)

## Ejercicio 4
Mejorar el ejercicio anterior para que devuelva las dos semanas del calendario en las que está el día actual, es decir, esta semana y la siguiente.

Ayúdate en esta función de fechas

 ```java
Calendar hoy = Calendar.getInstance();
int diaDeLaSemana = hoy.get(Calendar.DAY_OF_WEEK)
```

Esta operación devuelve el día de la semana: 1 para el domingo, 2 el lunes, …, 6 el sábado. Recorre el vector y muéstralo en la lista.

TRUCO: Retrocede los días que necesites y luego empieza a crear los objetos Dia e introdúcelos en el array de Dia
