package ud5.rol;

import java.util.Random;

public class Troll extends Monstruo {
    public Troll(String nombre) {
        super(nombre);
        Random rnd = new Random();
        ataque = rnd.nextInt(60, 121);
        defensa = rnd.nextInt(50, 71);
        velocidad = rnd.nextInt(20, 41);
        puntosVida = rnd.nextInt(100, 201);
    }

    public Troll() {
        Random rnd = new Random();
        ataque = rnd.nextInt(60, 121);
        defensa = rnd.nextInt(50, 71);
        velocidad = rnd.nextInt(20, 41);
        puntosVida = rnd.nextInt(100, 201);
    }
}
