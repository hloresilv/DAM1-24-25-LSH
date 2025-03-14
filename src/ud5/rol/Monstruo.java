package ud5.rol;

import java.util.Random;

public class Monstruo {
    String nombre;
    int ataque;
    int defensa;
    int velocidad;
    int puntosVida = 50;

    public Monstruo(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.puntosVida = puntosVida;
    }

    public Monstruo() {
    }

    public Monstruo(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    boolean perderVida(int puntos) {
        puntosVida -= puntos;
        return puntosVida <= 0;
    }

    public int getDefensa() {
        return defensa;
    }

    boolean estaVivo() {
        return puntosVida > 0;
    }

    int atacar(Monstruo m) {
        Random rnd = new Random();
        int ataqueMonstruo = rnd.nextInt(1, 101) + ataque;
        int defensaMonstruo = rnd.nextInt(1, 101) + m.defensa;
        int puntos = ataqueMonstruo - defensaMonstruo;
        if (puntos > 0) {
            m.perderVida(Math.min(puntos, m.puntosVida));
        }

        return puntos;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Habilidades:");
        System.out.println("\tDefensa: " + defensa);
        System.out.println("\tAtaque: " + ataque);
        System.out.println("Vida: " + puntosVida);
    }

    @Override
    public String toString() {
        String str = "";
        if (nombre != null)
            str += nombre + '-';

        str += getClass().toString();
        str += " (" + puntosVida + ")";
        return str;
    }

    Monstruo generaMonstruoAleatorio() {
        Monstruo m;
        Random rnd = new Random();
        int numero = rnd.nextInt(1, 101);
        if (numero <= 40) // 40% de probabilidad
            m = new Orco();
        else if (numero <= 70) // 30% de probabilidad
            m = new Aranha();
        else if (numero <= 90) // 20% de probabilidad
            m = new Troll();
        else // 10% de probabilidad
            m = new Dragon();

        return m;
    }
}
