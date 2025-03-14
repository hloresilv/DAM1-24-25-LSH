package ud5.rol;

import java.util.ArrayList;

public class App2Armas {
    public static void main(String[] args) {
        int[] habilidades;
        // Valkiria
        habilidades = new int[]{2, 2, 100}; // [Fuerza, Agilidad, Constitución]. Usaremos las mismas habilidades para cada personaje en este caso.
        Armadura yelmoDeHierro = new Armadura("Yelmo de hierro", 50.0, 100, 5);
        Armadura cotaDeMalla = new Armadura("Cota de Malla", 50.0, 100, 20);
        Arma espadaLarga = new Arma("Espada larga", 50.0, 100, 60, false); // No suponemos que NO es a dos manos, porque las armas a dos manos parecen tener "a dos manos" en su nombre como se ve después
        Armadura escudoDeMadera = new Armadura("Escudo de madera", 50.0, 100, 10);

        // Arturo
        Armadura yelmoDePlata = new Armadura("Yelmo de plata", 50.0, 100, 5);
        Armadura coraza = new Armadura("Coraza", 50.0, 100, 30);
        Arma espadosADosManos = new Arma("Espadón a dos manos", 50.0, 100, 50, true);

        ArrayList<Item> itemsValkiria = new ArrayList<Item>();
        ArrayList<Item> itemsArturo = new ArrayList<Item>();

        itemsValkiria.add(yelmoDeHierro);
        itemsValkiria.add(cotaDeMalla);
        itemsValkiria.add(espadaLarga);
        itemsValkiria.add(escudoDeMadera);

        itemsArturo.add(yelmoDePlata);
        itemsArturo.add(coraza);
        itemsArturo.add(espadosADosManos);

        // Suponemos que ambos son diestros, por tanto en el caso de Valkiria, el escudo irá a su mano izquierda, ya que el primer objeto es de una sola mano y se asigna preferentemente a su mano derecha
        PersonajeEx Valkiria = new PersonajeEx("Valkiria", Personaje.Raza.HUMANO, habilidades, 20, 30, 60, 30, itemsValkiria);
        PersonajeEx Arturo = new PersonajeEx("Arturo", Personaje.Raza.HUMANO, habilidades, 20, 30, 60, 30, itemsArturo);
        System.out.println("2. Armas y Armaduras\n====================\n");

        System.out.println("Equipo de combate de " + Valkiria.getNombre() + ':');
        for (int i = 0; i < Valkiria.items.toArray().length; i++) {
            System.out.println("- " + itemsValkiria.get(i).toString());
        }

        System.out.println("\nEquipo de combate de " + Arturo.getNombre() + ':');
        for (int i = 0; i < Arturo.items.toArray().length; i++) {
            System.out.println("- " + itemsArturo.get(i).toString());
        }
    }
}
