package ud2.ejerciciosfunciones;

/*
 * E0412. Diseñar una función recursiva que calcule el enésimo término de la serie de
 * Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores anteriores
 * de la serie, es decir:
 * fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
 * fibonacci(1) = 1
 * fibonacci(0) = 1
 */

public class E0412 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("El término " + n + " de la serie de Fibonacci es: " + fibonacci(n));
    }
}
