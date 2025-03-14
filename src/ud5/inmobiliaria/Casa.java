package ud5.inmobiliaria;

public class Casa extends Inmueble {
    int banhos;
    int terreno;

    public Casa(String direccion, int m2, int habitaciones, int banhos, int terreno) {
        super(direccion, m2, habitaciones);
        this.banhos = banhos;
        this.terreno = terreno;
    }

    public String detalle() {
        String str = "";
        str += "Casa en " + direccion + ".\n";
        str += m2 + " m2, " + habitaciones + " hab, " + banhos + " baños, " + " con terreno de " + terreno + " m2.\n";

        int precioAlquiler = getPrecioAlquiler();
        int precioVenta = getPrecioVenta();
        if (precioAlquiler > 0)
            str += "Precio de Alquiler: " + precioAlquiler + "€\n";
        if (precioVenta > 0)
            str += "Precio de Venta: " + precioVenta + "€\n";

        return str;
    }
}
