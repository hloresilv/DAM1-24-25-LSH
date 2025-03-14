package ud5.rol;

public class Arma extends Item {
    int ataque;
    boolean dosManos = false;

    public Arma(String nombre, double peso, int precio, int ataque, boolean dosManos) {
        super(nombre, peso, precio);
        if (ataque > 0)
            this.ataque = ataque;
        this.dosManos = dosManos;
    }

    @Override
    public String toString() {
        // Espadón a dos manos (+50 ataque)
        return nombre + " (+" + ataque + " ataque)";
    }
}
