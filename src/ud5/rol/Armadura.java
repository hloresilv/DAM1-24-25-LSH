package ud5.rol;

public class Armadura extends Item {
    int defensa;
    enum Tipo {YELMO, ARMADURA, ESCUDO}
    Tipo tipo;

    public Armadura(String nombre, double peso, int precio, int defensa) {
        super(nombre, peso, precio);
        if (defensa > 0)
            this.defensa = defensa;
    }

    @Override
    public String toString() {
        return nombre + " (+" + defensa + " defensa)";
    }
}
