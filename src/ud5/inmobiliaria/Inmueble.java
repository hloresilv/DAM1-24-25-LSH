package ud5.inmobiliaria;

import java.util.Arrays;
import java.util.Comparator;

public class Inmueble implements Comparable {
    int m2;
    int habitaciones;
    String direccion;
    int alquiler = 0;
    int venta;

    public Inmueble(String direccion, int m2, int habitaciones) {
        this.m2 = m2;
        this.habitaciones = habitaciones;
        this.direccion = direccion;
    }

    public void setPrecioAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public int getPrecioAlquiler() {
        return alquiler;
    }

    public int getPrecioVenta() {
        return venta;
    }

    public void setPrecioVenta(int venta) {
        this.venta = venta;
    }

    public String detalle() { return null; }

    @Override
    public String toString() {
        return "Inmueble en " + direccion + " (" + m2 + " m2, " + habitaciones + " hab)";
    }

    @Override
    public int compareTo(Object o) {
        Inmueble i1 = ((Inmueble) o);
        return direccion.compareToIgnoreCase(i1.direccion);
    }

    void sortMetrosDesc(Inmueble[] t) {
        Arrays.sort(t, new Comparator<Inmueble>() {
            @Override
            // Se podría usar .reversed() en vez de el símbolo negativo si el orden natural lo ordenásemos ascendentemente
            public int compare(Inmueble o1, Inmueble o2) {
                return -(((Inmueble) o1).m2 - ((Inmueble) o2).m2);
            }
        });
    }

    void sortHabMetrosDesc(Inmueble[] t) {
        Arrays.sort(t, new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                int res = -(o1.habitaciones - ((Inmueble) o2).habitaciones);
                if (res == 0) // Se podría usar .thenComparing()
                    return -(o1.m2 - o2.m2);
                else
                    return res;
            }
        });
    }

    public static void sortPrecioAlquilerAsc(Inmueble[] t) {
        Arrays.sort(t, new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                return o1.alquiler - o2.alquiler;
            }
        });
    }

    void sortPrecioVentaAsc(Inmueble[] t) {
        Arrays.sort(t, new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                return o1.getPrecioVenta() - o2.getPrecioVenta();
            }
        });
    }
}
