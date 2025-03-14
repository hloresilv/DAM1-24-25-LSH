package ud5.rol;

import java.util.Arrays;
import java.util.Random;

// @author Hugo Lorenzo Silva

public class Personaje implements Comparable {
    private final String nombre;

    enum Raza {HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL}
    private final Raza raza;
    private final int[] habilidades = new int[3]; // [Fuerza, Agilidad, Constitución]
    private int nivel = 1;
    private double experiencia = 0.0;
    private double vida = 50 + habilidades[2]; // 50 + Constitución

    public Personaje(String nombre, Raza raza, int[] habilidades, int nivel, double experiencia, double vida) {
        this.nombre = nombre;
        this.raza = raza; // siempre va a ser válido porque tienes que pasar algo que sea parte del enum

        for (int i = 0; i < this.habilidades.length; i++) {
            if (habilidades[i] > 0)
                this.habilidades[i] = habilidades[i];
        }

        if (nivel >= 1)
            this.nivel = nivel;
        else
            throw new IllegalArgumentException("Nivel inválido");
        if (experiencia >= 0)
            this.experiencia = experiencia;
        else
            throw new IllegalArgumentException("Cantidad de experiencia inválida");
        if (vida >= 1) // ¿Hay que comprobar también que la vida que nos pasen no sea menor a la inicial?
            this.vida = vida;
        else
            throw new IllegalArgumentException("Cantidad de vida inválida");
    }

    public Personaje(String nombre, Raza raza, int[] habilidades) {
        this.nombre = nombre;
        this.raza = raza;
        for (int i = 0; i < this.habilidades.length; i++) {
            if (habilidades[i] > 0)
                this.habilidades[i] = habilidades[i];
        }
        // Resto de valores ya inicializados en la clase
    }

    public Personaje(String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;
        Random rnd = new Random();
        for (int i = 0; i < habilidades.length; i++) {
            habilidades[i] = rnd.nextInt(1, 101);
        }
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
        raza = Raza.HUMANO;
        Random rnd = new Random();
        for (int i = 0; i < habilidades.length; i++) {
            habilidades[i] = rnd.nextInt(1, 101);
        }
        // Aunque en el enunciado dices "se rellenarán los atributos numéricos aleatoriamente", pone "tambien", haciendo referencia a la sentencia anterior
        // En la sentencia anterior, solo se especifica que las características físicas sean rellenadas con valores aleatorios
    }

    public String getNombre() {
        return nombre;
    }

    public double getVida() {
        return vida;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Habilidades:");
        for (int i = 0; i < habilidades.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("\tFuerza: " + habilidades[i]);
                    break;
                case 1:
                    System.out.println("\tAgilidad: " + habilidades[i]);
                    break;
                case 2:
                    System.out.println("\tConstitución: " + habilidades[i]);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Vida: " + vida);
    }

    @Override
    public String toString() {
        return nombre + " (" + vida + '/' + (50 + habilidades[2]) + ')';
    }

    byte sumarExperiencia(int puntos) {
        byte exp = 0;
        while ((puntos + experiencia) / 1000 > 0) {
            exp++;
            puntos = puntos - 1000;
        }

        nivel += exp;
        return exp;
    }

    void subirNivel() {
        nivel++;
        for (int i = 0; i < habilidades.length; i++) {
            habilidades[i] = habilidades[i] * 5 / 100;
        }
    }

    void curar() {
        if (vida <= habilidades[2] + 50)
            vida = habilidades[2] + 50;
    }

    boolean perderVida(int puntos) {
        vida -= puntos;
        return vida <= 0;
    }

    boolean estaVivo() {
        return vida > 0;
    }

    int atacar(Personaje enemigo) {
        Random rnd = new Random();
        int ataque = rnd.nextInt(1, 101) + habilidades[0]; // 1-100 + fuerza
        int defensa = rnd.nextInt(1, 101) + enemigo.habilidades[1]; // 1-100 + agilidad
        int puntos = ataque - defensa;
        if (puntos > 0) {
            if (puntos <= enemigo.vida)
                enemigo.perderVida(puntos);
            else
                enemigo.perderVida((int)enemigo.vida); // lo mata directamente

            enemigo.sumarExperiencia(puntos);
            sumarExperiencia(puntos);
        }

        return puntos;
    }

    int atacar(Monstruo m) {
        Random rnd = new Random();
        int ataque = rnd.nextInt(1, 101) + habilidades[0]; // 1-100 + fuerza
        int defensa = rnd.nextInt(1, 101) + m.getDefensa(); // 1-100 + agilidad
        int puntos = ataque - defensa;
        if (puntos > 0) {
            m.perderVida(Math.min(puntos, m.getPuntosVida()));
            sumarExperiencia(puntos);
        }

        return puntos;
    }

    public boolean equals(Personaje obj) {
        return nombre.equals(obj.nombre) && raza.equals(obj.raza); // Si se llaman igual y tienen la misma raza, asumimos que son iguales. Podemos hacerlo con compareTo o usando todos os atributos con super.equals
    }

    @Override
    public int compareTo(Object o) {
        Personaje p = ((Personaje) o);
        if (habilidades[2] > p.habilidades[2])
            return habilidades[2] - p.habilidades[2]; // Siempre va a ser positivo
        else if (habilidades[2] < p.habilidades[2])
            return habilidades[2] - p.habilidades[2]; // Siempre va a ser negativo

        return 0; // 0 si los dos son iguales
    }

    public static Personaje[] sortAgilidadDesc(Personaje[] personajes) {
        Personaje[] personajesOrdenado = new Personaje[personajes.length];
        Arrays.sort(personajesOrdenado); // lo ordenará ya que este sort usa internamente compareTo
        return personajesOrdenado;
    }
}