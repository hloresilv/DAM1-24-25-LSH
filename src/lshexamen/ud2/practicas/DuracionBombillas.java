package lshexamen.ud2.practicas;

// @Author Hugo Lorenzo Silva

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class DuracionBombillas {

    public static String causaFinBombilla(int horasMax, int encendidos, int horasUso) {
        String mensaje = "";
        int horasSimuladas = 0;
        boolean limiteEncendidos = false;

        // Sanity checks
        if (horasUso <= 0 || horasMax <= 0 || encendidos <= 0) {
            mensaje = "ERROR";
            return mensaje;
        }
        if (horasUso > 10) {
            mensaje = "ERROR";
            return mensaje;
        }

        // Simulación de cuándo se superará un límite antes
        for (int i = 1; i < horasMax; i++) {
            // i++; quitar esta línea para que el programa funcione
            horasSimuladas += horasUso;
            if (i >= encendidos) {
                mensaje = "ENCENDIDOS";
                limiteEncendidos = true;
                break;
            }
            // Cambiar el orden para que no retorne antes de tiempo
            if (horasSimuladas >= horasMax) {
                break;
            }
        }

        if (encendidos * horasUso >= horasMax) {
            if (limiteEncendidos == true)
                mensaje += " + HORAS";
            else
                mensaje += "HORAS";
        }

        return mensaje;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(causaFinBombilla(2000, 700, 3)); // Error que tuve para debuguear
    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }
}
