package proyectos.marotierra;

import java.util.Scanner;

/**
 * Juego de adivinar si un punto geográfico está en el mar o en tierra.
 * Falla cuando el punto geográfico está en la Antártida porque OSM no devuelve un país.
 */
public class AppMarOTierra {
    public static void main(String[] args) {
        final int MAX_ACIERTOS = 5;
        final int MAX_FALLOS = 3;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMAR O TIERRA?\n=============\n");
        System.out.println("Adivina si el punto geográfico de las coordenadas dadas está en tierra o en el mar.\n"
                + "Tienes que acertar " + MAX_ACIERTOS + " veces para ganar."
                + " Si fallas " + MAX_FALLOS + " veces pierdes.\n");

        int aciertos = 0;
        int fallos = 0;
        int numPregunta = 0;

        while (aciertos < MAX_ACIERTOS && fallos < MAX_FALLOS) {
            System.out.println("Pulsa Enter para continuar...");
            sc.nextLine();

            numPregunta++;
            System.out.println("\nPREGUNTA Nº " + numPregunta + ":");
            System.out.println("==============\n");
            PuntoGeografico puntoGeografico = new PuntoGeografico().generarAleatorio();
            System.out.println("Coordenadas: ");
            puntoGeografico.mostrarGradosDMS();
            String country = puntoGeografico.getCountry();

            char respuesta;
            do {
                System.out.print("¿Mar (m) o tierra (t)? ");
                respuesta = sc.nextLine().charAt(0);

                switch (respuesta) {
                    case 'm':
                        if (country == null) {
                            System.out.println("¡Correcto!");
                            aciertos++;
                        } else {
                            System.out.println("¡Incorrecto! La ubicación pertenece a " + country + ".");
                            fallos++;
                        }
                        break;
                    case 't':
                        if (country != null) {
                            System.out.println("¡Correcto! La ubicación pertenece a " + country + ".");
                            aciertos++;
                        } else {
                            System.out.println("¡Incorrecto!");
                            fallos++;
                        }
                        break;
                    default:
                        System.out.println("Respuesta no válida.");
                }
            } while (respuesta != 'm' && respuesta != 't');

            System.out.println("Consulta el mapa: " + puntoGeografico.urlGoogleMaps());
            System.out.println("JSON: " + puntoGeografico.urlNominatimJson());
            System.out.println("Llevas " + aciertos + " aciertos y " + fallos + " fallos.\n");
        }

        if (aciertos == MAX_ACIERTOS) {
            System.out.println("¡Has ganado! :DDD \n");
        } else {
            System.out.println("¡Has perdido! :'( \n");
        }

        sc.close();
    }
}