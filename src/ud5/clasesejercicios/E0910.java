package ud5.clasesejercicios;

import java.util.*;

public class E0910 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Integer[] tabla = new Integer[20];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rnd.nextInt(1, 101);
        }

        Arrays.sort(tabla, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2); // decreciente
            }
        });
        Arrays.sort(tabla, Collections.reverseOrder());
        System.out.println(Arrays.toString(tabla));
    }
}