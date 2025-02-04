package ud2.ejerciciosfunciones;

/*
 * E0411. Escribir una función que calcule de forma recursiva el máximo común divisor de
 * dos números. Para ello sabemos:
 * mcd(a,b) =
 * mcd(a - b, b) si a >= b
 * mcd(a, b - a) si b > a
 * a si b = 0
 * b si a = 0
 */

public class E0411 {

    private static int mcd(int a, int b) {
        int max_com_div = 0;
        
        if (b == 0) return a;
        if (a == 0) return b;

        if (a >= b) {
            max_com_div = mcd(a - b, b);
        } else if (b > a) {
            max_com_div = mcd(a, b - a);
        }

        return max_com_div;
    }
    public static void main(String[] args) {
        System.out.println(mcd(8, 16));
    }
}
