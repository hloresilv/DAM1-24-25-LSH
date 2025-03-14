package ud5.inmobiliaria;

public class Piso extends Inmueble {
    int banhos;
    int planta;

    public Piso(String direccion, int m2, int habitaciones, int banhos, int planta) {
        super(direccion, m2, habitaciones);
        this.banhos = banhos;
        this.planta = planta;
    }

    public String detalle() {
        String str = "";
        str += "Piso en " + direccion + ".\n";
        str += m2 + " m2, " + habitaciones + " hab, " + banhos + " baños, " + planta + "ª planta.\n";

        int precioAlquiler = getPrecioAlquiler();
        int precioVenta = getPrecioVenta();
        if (precioAlquiler > 0)
            str += "Precio de Alquiler: " + precioAlquiler + "€\n";
        if (precioVenta > 0)
            str += "Precio de Venta: " + precioVenta + "€\n";

        return str;
    }
}
