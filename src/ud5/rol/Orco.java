package ud5.rol;

import java.util.Random;

public class Orco extends Monstruo {
    public Orco(String nombre) {
        super(nombre);
        Random rnd = new Random();
        ataque = rnd.nextInt(30, 81);
        defensa = rnd.nextInt(30, 51);
        velocidad = rnd.nextInt(30, 61);
        puntosVida = rnd.nextInt(30, 101);
    }

    public Orco() {
        Random rnd = new Random();
        ataque = rnd.nextInt(30, 81);
        defensa = rnd.nextInt(30, 51);
        velocidad = rnd.nextInt(30, 61);
        puntosVida = rnd.nextInt(30, 101);
    }
}
