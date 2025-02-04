package lshexamen.ud2.practicas;

// @Author Hugo Lorenzo Silva

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ChiclesRegalo {

    public static int totalChicles(int chiclesComprados, int envoltorios, int chiclesGratis) {
        int total = chiclesComprados;
        int chiclesExtra = 0;

        // Sanity checks
        if (envoltorios == 0) { // Poner esta condición al principio del todo
            return chiclesComprados;
        }
        if (chiclesGratis > 0 && chiclesGratis >= envoltorios) {
            return -1;
        }
        if (chiclesComprados < 0 || envoltorios < 0 || chiclesGratis < 0) {
            return -1;
        }       
        
        // Cada chicle tiene un envoltorio
        while (chiclesComprados >= envoltorios) {
            chiclesExtra = chiclesComprados / envoltorios;
            total += chiclesExtra; 
            chiclesComprados = chiclesExtra + chiclesComprados % envoltorios;
        }

        return total;
    }

    public static void main(String[] args) {
        // Sin errores
        System.out.println(totalChicles(25, 5, 1));
        System.out.println(totalChicles(5, 5, 1));
        System.out.println(totalChicles(100, 10, 1));
        System.out.println(totalChicles(100, 0, 0));
        System.out.println(totalChicles(20, 2, 5));
        System.out.println(totalChicles(10, -1, 0));
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
        assertEquals(-1, totalChicles(-1, 2, 1));
        assertEquals(-1, totalChicles(10, 1, -1));
        assertEquals(-1, totalChicles(20, 2, 2));
        assertEquals(10, totalChicles(7, 3, 1));
        assertEquals(40, totalChicles(27, 3, 1));
        assertEquals(21, totalChicles(11, 2, 1));
        assertEquals(31, totalChicles(16, 2, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(100, totalChicles(100, 0, 1));
        assertEquals(0, totalChicles(0, 0, 1));
        assertEquals(0, totalChicles(0, 2, 1));
    }
}
