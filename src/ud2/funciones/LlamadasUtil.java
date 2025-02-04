package ud2.funciones;

import java.util.Scanner;
import ud2.Util;

public class LlamadasUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número / Anho: ");
        int n = sc.nextInt();
        sc.close();
        
        if (Util.esPar(n)) {
            System.out.println("Es un número par");
        } else {
            System.out.println("No es un número par.");
        }

        if (Util.esBisiesto(n)) {
            System.out.println("Es un año bisiesto.");
        } else {
            System.out.println("No es un año bisiesto");
        }
    }
}
