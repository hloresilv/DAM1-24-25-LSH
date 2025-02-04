package ud4.apuntes;

import java.util.Arrays;

public class E0504 {
    static Integer maximo(int t[]) {
        if (t == null | t.length == 0)
            return null; // para poder devolver null en vez de 0, necesitamos usar Integer en vez de int

        Integer maximo = t[0]; // Se podría inicializar a Integer.MIN_VALUE también

        for (int i = 0; i < t.length; i++)
            if (t[i] > maximo)
                maximo = t[i];
        
        return maximo;
    }

    public static void main(String[] args) {
        int[] t = null;

        System.out.println(Arrays.toString(t));

        System.out.println("Máximo: " + maximo(t));
    }
}
