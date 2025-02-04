package ud2.practicas;

/*
 * Diseñar un programa que simule el lanzamiento de un dado de 6 caras un número de veces
 * codificado como una constante NUM_LANZAMIENTOS.
 * El programa mostrará una estadística final que recoja el número de veces que ha salido cada cara
 * del dado y el porcentaje sobre el total de lanzamientos.
 * El porcentaje se mostrará como un número entero o como un número real con un máximo de 2
 * decimales, con una salida por pantalle similar a la siguiente:
 */

public class Dado {
    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 1000;
        int cara1 = 0;
        int cara2 = 0;
        int cara3 = 0;
        int cara4 = 0;
        int cara5 = 0;
        int cara6 = 0;

        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int lanzamiento = (int)(Math.random() * 7);
            switch (lanzamiento) {
                case 1:
                    cara1++;
                    break;
                case 2:
                    cara2++;
                    break;
                case 3:
                    cara3++;
                    break;
                case 4:
                    cara4++;
                    break;
                case 5:
                    cara5++;
                    break;
                case 6:
                    cara6++;
                    break;
                default:
                    break;
            }
        }

        System.out.printf("Ha salido 1: %d veces ( %.2f ", cara1, (double)cara1*100/1000); System.out.println("%)");
        System.out.printf("Ha salido 2: %d veces ( %.2f ", cara2, (double)cara2*100/1000); System.out.println("%)");
        System.out.printf("Ha salido 3: %d veces ( %.2f ", cara3, (double)cara3*100/1000); System.out.println("%)");
        System.out.printf("Ha salido 4: %d veces ( %.2f ", cara4, (double)cara4*100/1000); System.out.println("%)");
        System.out.printf("Ha salido 5: %d veces ( %.2f ", cara5, (double)cara5*100/1000); System.out.println("%)");
        System.out.printf("Ha salido 6: %d veces ( %.2f ", cara6, (double)cara6*100/1000); System.out.println("%)");
    }
}
