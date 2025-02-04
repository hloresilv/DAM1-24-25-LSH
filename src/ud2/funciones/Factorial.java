package ud2.funciones;

public class Factorial {
    // Método Java no recursivo para calcular el factorial de un número
    public static double factorial(int n) {
        double fact = 1;
        int i;
        if (n == 0) {
            fact = 1;
        } else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    // Método Java recursivo para calcular el factorial de un número
    public static double factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * (factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

        System.out.println(factorialRecursivo(5));
    }
}
