package ud1.ejercicios.lsh20241004;

import java.util.Scanner;

/*
 * EP0133_ConversionAlmacenamientoDatos
Desarrolla un programa en Java que convierta unidades de almacenamiento entre bytes,
kilobytes (KB), megabytes (MB) y gigabytes (GB). Solicita al usuario la cantidad de datos y
la unidad de origen y destino.
● 1 KB = 1024 bytes
● 1 MB = 1024 KB
● 1 GB = 1024 MB
El programa deberá realizar la conversión correspondiente y mostrar el resultado.

 */

public class EP0133 {
    public static void main(String[] args) {
        double cantidadDatos;
        int unidadOrigen;
        int unidadDestino;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce la cantidad de datos: ");
            cantidadDatos = sc.nextInt();
            System.out.println("Introduce la unidad de origen: KiloBytes(1), Megabytes (2), GigaBytes (3): ");
            unidadOrigen = sc.nextInt();
            System.out.println("Introduce la unidad de destino: KiloBytes(1), Megabytes (2), GigaBytes (3): ");
            unidadDestino = sc.nextInt();
        }

        double bytes = unidadOrigen == 1 ? cantidadDatos * 1024 : unidadOrigen == 2 ? cantidadDatos * 1024 * 1024 : unidadOrigen == 3 ? cantidadDatos * 1024 * 1024 * 1024 : cantidadDatos;
        double cantidadDestino = unidadDestino == 1 ? bytes / 1024 : unidadDestino == 2 ? bytes / 1024 / 1024 : unidadDestino == 3 ? bytes / 1024 / 1024 / 1024 : bytes;
        System.out.println("La cantidad de datos convertida a la medida de destino es " + cantidadDestino);
    }
}
