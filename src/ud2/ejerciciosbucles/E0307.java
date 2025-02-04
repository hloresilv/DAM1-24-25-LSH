package ud2.ejerciciosbucles;

/*
 * E0307. Escribir todos los múltiplos de 7 menores que 100.
 */
public class E0307 {
    public static void main(String[] args) {        
        for (int i = 7; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.printf("Nuḿero múltiplo de 7 menos que 100: %d\n", i);
            }
        }
    }
}
