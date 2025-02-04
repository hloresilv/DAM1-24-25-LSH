package ud4.ejercicios;

public class E0611 {
    static String codifica(String conjunto1, String conjunto2, String palabra) {
        String encoded  = "";

        for (int i = 0; i < palabra.length(); i++) {
            char letraActual = Character.toLowerCase(palabra.charAt(i));
            int posicion = conjunto1.indexOf(letraActual);
            if (posicion == -1) { // Si no está en el conjunto1
                encoded += letraActual; // Se añade sin más
            } else { // Si está en conjunto1
                encoded += conjunto2.charAt(posicion); // Se encripta buscando su equivalente con su correspondiente en el conjunto2
            }
        }
        return encoded;
    }

    static char codifica(char conjunto1[], char conjunto2[], char c) {
        char encoded  = ' ';
        for (int i = 0; i < conjunto1.length; i++) {
            if (conjunto1[i] == c) {
                encoded = conjunto2[i];
                break;
            }
        }
        return encoded;
    }

    static String codifica(char conjunto1[], char conjunto2[], String frase) {
        boolean found = false;
        frase = frase.toLowerCase();
        String encoded = "";
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < conjunto1.length; j++) {
                if (conjunto1[j] == frase.charAt(i)) {
                    encoded += conjunto2[j];
                    found = true;
                    break;
                }
            }
            if (!found) {
                encoded += frase;
            }
            found = false;
            // frase = frase.replace(conjunto1[i], conjunto2[i]); NO es valido
        }
        return encoded;
    }

    public static void main(String[] args) {
        char[] container1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char[] container2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        System.out.println(codifica("eikmpqrstuv", "pviumterkqs", "Manolo"));
    }
}
