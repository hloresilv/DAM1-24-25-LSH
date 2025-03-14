package ud5.rol;

import java.util.Random;

public class Aranha extends Monstruo {
    public Aranha(String nombre) {
        super(nombre);
        Random rnd = new Random();
        ataque = rnd.nextInt(10, 51);
        defensa = rnd.nextInt(20, 41);
        velocidad = rnd.nextInt(40, 71);
        puntosVida = rnd.nextInt(30, 81);
    }

    public Aranha() {
        Random rnd = new Random();
        ataque = rnd.nextInt(10, 51);
        defensa = rnd.nextInt(20, 41);
        velocidad = rnd.nextInt(40, 71);
        puntosVida = rnd.nextInt(30, 81);
    }
}
