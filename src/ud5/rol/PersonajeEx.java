package ud5.rol;

import java.util.ArrayList;

public class PersonajeEx extends Personaje {
    public int monedas = 0;
    ArrayList<Item> items = new ArrayList<>(); // Necesario inicializar a algo diferente de null para evitar NullPointerException
    Arma itemManoIzq;
    Arma itemManoDhc;
    Armadura armaduraCabeza = null;
    Armadura armaduraCuerpo = null;
    boolean esZurdo = false;

    public PersonajeEx (String nombre,
                       Raza raza,
                       int[] habilidades,
                       int nivel,
                       double experiencia,
                       double vida,
                       int monedas,
                       ArrayList<Item> items,
                       Arma itemManoIzq,
                       Arma itemManoDhc,
                       Armadura armaduraCabeza,
                       Armadura armaduraCuerpo,
                       boolean esZurdo
    ) {
        super(nombre, raza, habilidades, nivel, experiencia, vida);
        if (monedas > 0)
            this.monedas = monedas;

        double cargaTransportada = 0.0;
        for (Item item : items) {
            cargaTransportada += item.peso;
        }

        if (cargaTransportada <= 50 + habilidades[2] * 2) { // Si no supera la carga máxima del personaje
            this.items.addAll(items);
        }

        if (itemManoIzq != null || armaduraCuerpo.tipo.equals(Armadura.Tipo.ESCUDO)) // Si es un arma O es una armadura de tipo escudo
            this.itemManoIzq = itemManoIzq;
        if (itemManoDhc != null) {
            assert itemManoIzq != null; // Comprobamos primero que para el item de la mano izquierda no se ha pasado null, en caso de que se quiera pasar por el parámetro de armadura. Son ambos casteables ya que pertenecen a Item
            if (!itemManoIzq.dosManos) this.itemManoDhc = itemManoDhc; // Si la arma no es a dos manos, se asigna el arma a la mano derecha
            else this.itemManoDhc = itemManoIzq; // En caso contrario, es un arma a dos manos y por ende la arma de la mano izquierda es la misma que la de la derecha
        }
        if (armaduraCabeza != null && armaduraCabeza.tipo.equals(Armadura.Tipo.YELMO))
           this.armaduraCabeza = armaduraCabeza;
        if (armaduraCuerpo != null && armaduraCuerpo.tipo.equals(Armadura.Tipo.ARMADURA))
            this.armaduraCuerpo = armaduraCuerpo;

        this.esZurdo = esZurdo;
    }

    public PersonajeEx(String nombre, Raza raza, int[] habilidades, int nivel, double experiencia, double vida, int monedas, ArrayList<Item> items) {
        super(nombre, raza, habilidades, nivel, experiencia, vida);
        if (monedas > 0)
            this.monedas = monedas;

        double cargaTransportada = 0.0;
        for (Item item : items) {
            cargaTransportada += item.peso;
        }
        if (cargaTransportada <= 50 + habilidades[2] * 2) { // Si no supera la carga máxima del personaje
            this.items.addAll(items);
        }
    }

    public PersonajeEx(String nombre, Raza raza, int[] habilidades, int nivel, double experiencia, double vida) {
        super(nombre, raza, habilidades, nivel, experiencia, vida);
    }

    public PersonajeEx(String nombre, Raza raza, int[] habilidades) {
        super(nombre, raza, habilidades);
    }

    public PersonajeEx(String nombre, Raza raza) {
        super(nombre, raza);
    }

    public PersonajeEx(String nombre) {
        super(nombre);
    }

    public boolean addToInventario(Item item) {
        double cargaTransportada = 0.0;
        for (Item items : items) {
            cargaTransportada += item.peso;
        }
       if (item.peso > cargaTransportada)
           return false;

       items.add(item);
       return true;
    }

    public boolean equipar(Arma arma) {
        // Si las dos referencias apuntan a la misma dirección de memoria, es decir, son el mismo objeto, significa que el personaje tiene un arma a dos manos. No podrá equipar más
        if (itemManoIzq != null && itemManoDhc != null && itemManoDhc == itemManoIzq)
            return false;
        if (arma.dosManos && (itemManoIzq != null || itemManoDhc != null)) { // Si la arma es a dos manos pero alguna de las dos manos están ocupadas, retornar false
            return false;
        }

        // En caso contrario, la arma es a una mano y se tratará de equipar siempre que haya espacio libre
        if (!arma.dosManos) {
            if (esZurdo) {
                if (itemManoIzq == null) // Si la mano está libre
                    itemManoIzq = arma;
                else
                    itemManoDhc = arma; // En caso contrario, solo la mano derecha estará libre, así que aunque sea zurdo, se asigna a este valor
            }
            else {
                if (itemManoDhc == null) // Si la mano está libre
                    itemManoDhc = arma;
                else
                    itemManoIzq = arma; // En caso contrario, solo la mano izquierda estará libre, así que aunque sea zurdo, se asigna a este valor
            }
        }

        return true;
    }

    public boolean equipar(Armadura armadura) {
        // si armaduraCabeza (lo que el personaje tiene equipado) y armadura (lo que nos pasan como parámetro) son un yelmo, return false
        if (armaduraCabeza.tipo.equals(Armadura.Tipo.YELMO) && armadura.tipo.equals(Armadura.Tipo.YELMO))
            return false;

        armaduraCabeza = armadura;
        return true;
    }
}
