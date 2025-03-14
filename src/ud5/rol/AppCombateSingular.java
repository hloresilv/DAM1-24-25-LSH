package ud5.rol;

import java.util.Random;

public class AppCombateSingular {
    public static void mostrarFichas(boolean inicio, Personaje p1, Personaje p2) {
        if (inicio)
            System.out.println("================FICHAS DE LOS PERSONAJES AL INICIO DEL COMBATE ================");
        else
            System.out.println("================FICHAS DE LOS PERSONAJES AL FINAL DEL COMBATE ================");
        p1.mostrar();
        System.out.println("\n"); // Dos saltos de espacio
        p2.mostrar();

        System.out.println("==============================================================================");
    }

    public static void mostrarAtaque(int atacante, Personaje p1, Personaje p2) {
        int puntos = 0;
        if (atacante < 2) {
            System.out.println(p1.getNombre() + '(' + p1.getVida() + ") ataca a " + p2.getNombre() + '(' + p2.getVida() + ')');
            puntos = p1.atacar(p2);
        } else {
            System.out.println(p2.getNombre() + '(' + p2.getVida() + ") ataca a " + p1.getNombre() + '(' + p1.getVida() + ')');
            puntos = p2.atacar(p1);
        }

        if (puntos >0) {
            System.out.print("¡El ataque de ");
            if (atacante < 2)
                System.out.print(p1.getNombre() + " ha tenido éxito\n");
            else
                System.out.print(p2.getNombre() + " ha tenido éxito\n");
        }
        else
            System.out.println("¡El ataque ha sido esquivado!");
    }

    public static void iniciarCombate(int atacante, Personaje p1, Personaje p2) {
        while (p1.estaVivo() && p2.estaVivo()) {
            Random rnd = new Random();
            atacante = rnd.nextInt(1, 3);
            mostrarAtaque(atacante, p1, p2);
        }

        if (p1.estaVivo()) {
            System.out.println(p2.getNombre() + " ha muerto... :(");
        } else {
            System.out.println(p1.getNombre() + " ha muerto... :(");
        }

        mostrarFichas(false, p1, p2);
    }

    public static void main(String[] args) {
        int[] habilidadesP1 = {1, 2, 3}; // [Fuerza, Agilidad, Constitución]
        int[] habilidadesP2 = {1, 3, 2}; // [Fuerza, Agilidad, Constitución]
        Personaje Alker = new Personaje("Alker", Personaje.Raza.HUMANO, habilidadesP1);
        Personaje Kayro = new Personaje("Kayro", Personaje.Raza.HUMANO, habilidadesP2);

        int primerAtaque = 0;

        if (habilidadesP1[1] > habilidadesP2[1]) {
            primerAtaque = 1; // Empieza P1
        } else {
            Random rnd = new Random();
            primerAtaque = rnd.nextInt(1, 3); // Empieza P1 o P2 pseudo-aleatoriamente
        }

        mostrarFichas(true, Alker, Kayro);
        iniciarCombate(primerAtaque, Alker, Kayro);
    }
}
