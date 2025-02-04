package ud1.identificadores;

import java.time.*;

public class Constantes {
    public static void main(String[] args) {
        final byte NUM_ALUMNOS_PROGRAMACION = 32;
        final String NOMBRE_CLASE = "DAM";
        
        System.out.println("Número de alumnos matriculados en el módulo de Programación: " + NUM_ALUMNOS_PROGRAMACION);
        System.out.println("Nombre de la clase: " + NOMBRE_CLASE);

        System.out.println(Math.random());
        System.out.println(Math.pow(9, 3));
        System.out.println("La fecha de hoy es: " + LocalDate.now() + " con hora: " + LocalTime.now());

        final LocalDateTime ahora = LocalDateTime.now();        
        final int DIA = ahora.getDayOfMonth();
        final int MES = ahora.getMonthValue();
        final int AÑO = ahora.getDayOfYear();
        final int AÑO_ACTUAL = ahora.getYear();
        final int HORA = ahora.getHour();
        final int MINUTOS = ahora.getSecond();
        final int SEGUNDOS = ahora.getSecond();
        final int REMAINING_TIME = 60 - SEGUNDOS;

        System.out.println("Día de mes: " + DIA);
        System.out.println("Mes de hoy: " + MES);
        System.out.println("Día del año: " + AÑO + " con año actual: " + AÑO_ACTUAL);
        System.out.println("Hora actual: " + HORA);
        System.out.println("Minuto actual: " + MINUTOS);
        System.out.println("Segundo actual: " + SEGUNDOS);

        System.out.println("Hoy es el día " + DIA + " del mes " + MES + " del año " + AÑO_ACTUAL + ". Y son las " + HORA + " y " + MINUTOS + ". Quedan " + REMAINING_TIME + " segundos para que acabe este minuto  ");
    }
}