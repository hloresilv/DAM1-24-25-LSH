package ud2.ejerciciosbucles;
/*
 * Diseñar un programa que muestre la suma de los 10 primeros números impares
 */
public class E0310 {
    public static void main(String[] args) {
        int numero = 0;

        for (int i = 0; i <=10; i++) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
