package ud5.rol;

import java.util.ArrayList;

public class App1Inventario {
    public static void main(String[] args) {
        int[] habilidades;
        habilidades = new int[]{2, 2, 100}; // [Fuerza, Agilidad, Constitución]
        ArrayList<Item> items = getItems();
        PersonajeEx Arturo = new PersonajeEx("Arturo", Personaje.Raza.HUMANO, habilidades, 20, 30, 60, 30, items);

        System.out.println("1. Inventario de personaje\n==========================\n"); // Según el enunciado, hay dos espacios al final (uno lo conseguimos con println y otro con \n
        System.out.println("Inventario de " + Arturo.getNombre());

        double cargaTransportada = 0.0;
        for (int i = 0; i < Arturo.items.toArray().length; i++) {
            System.out.println((i + 1) + ". " + items.get(i).toString()); // i + 1 porque según el enunciado empieza en 1 y no en 0 como las arrays típicas
            cargaTransportada += items.get(i).peso;
        }

        System.out.println(); // Espacio adicional del enunciado
        System.out.print("Carga total transportada:");
        String cargaTransportadaStr = String.format("%.2f", cargaTransportada);
        System.out.printf(cargaTransportadaStr + "/%.2f kilos", cargaTransportada, 50 + habilidades[2] * 2);
    }

    private static ArrayList<Item> getItems() {
        Item cotaDeMalla = new Item("Cota de Malla", 10, 200);
        Item espadaLarga = new Item("Espada larga", 3, 10000);
        Item espadon = new Item("Espadón a dos manos", 5, 1000);
        Item pan = new Item("Pan", 1, 1);
        Item agua = new Item("Agua", 2, 1);
        Item daga = new Item("Daga", 0.5, 200);
        Item antorcha = new Item("Antorcha", 0.75, 10);
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(cotaDeMalla);
        items.add(espadaLarga);
        items.add(espadon);
        items.add(pan);
        items.add(agua);
        items.add(daga);
        items.add(antorcha);
        return items;
    }
}
