package ud5.rol;

public class Item {
    String nombre;
    double peso; // kg
    int precio;

    public Item(String nombre, double peso, int precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + ", peso: " + peso + " kilos, precio: " + precio + " monedas";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // mismo nombre, el mismo peso y el mismo precio
    }
}
