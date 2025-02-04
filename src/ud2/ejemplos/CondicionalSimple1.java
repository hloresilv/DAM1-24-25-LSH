package ud2.ejemplos;

/*
* Programa que pide una nota por teclado y muestra un mensaje si la nota es
* mayor o igual que 5
*/
import java.util.*;

public class CondicionalSimple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota: ");
        int nota = sc.nextInt();

        if (nota >= 5) {
            System.out.println("Enhorabuena!!");
        }
        sc.close();
        
        System.out.println("Hasta Pronto!");
    }
}