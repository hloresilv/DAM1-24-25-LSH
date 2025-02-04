package ud4.ejercicios;
import java.util.Random;

public class SorteoParejas {
    public static void main(String[] args) {
        // en este caso las personas son pares, pero podríamos añadir un check para asegurarse de que nunca sean impares
        String[] personas = {
                "Alejandro", "Celia", "Israel", "Jorge", "Adrián", "Hugo", "David B.",
                "Carlos", "Pablo", "Antonio", "Álvaro", "Yago", "Eva", "Arón", "André",
                "Hugo C.", "José", "Rocío", "Saúl"
        };

        int n = personas.length;
        int[] indices = new int[n];//  para mantener el orden aleatorio de los índices

        // inicializar el array de índices con valores secuenciales
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int j = random.nextInt(n);
            int temp = indices[i];
            indices[i] = indices[j];
            indices[j] = temp;
        }

        System.out.println("Las parejas sorteadas son:");
        // Esta última comprobación (n - 1) asegura que el index de la array no se vaya fuera de sus límites
        for (int i = 0; i < n - 1; i += 2) {
            String persona1 = personas[indices[i]];
            String persona2 = personas[indices[i + 1]];
            System.out.println(persona1 + " - " + persona2);
        }
    }
}