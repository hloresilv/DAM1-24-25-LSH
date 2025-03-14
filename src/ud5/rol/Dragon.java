package ud5.rol;

import java.util.Random;

public class Dragon extends Monstruo {
    public Dragon(String nombre) {
        super(nombre);
        Random rnd = new Random();
        ataque = rnd.nextInt(100, 201);
        defensa = rnd.nextInt(60, 101);
        velocidad = rnd.nextInt(80, 121);
        puntosVida = rnd.nextInt(120, 251);
    }

    public Dragon() {
        Random rnd = new Random();
        ataque = rnd.nextInt(100, 201);
        defensa = rnd.nextInt(60, 101);
        velocidad = rnd.nextInt(80, 121);
        puntosVida = rnd.nextInt(120, 251);
    }
}
