package ud5.rol;

public class AppCombateGrupos {
    public static void main(String[] args) {
        int[] grupo1 = new int[3];
        int[] grupo2 = new int[3];

        setGroups();
        setGroups();
    }

    private static void setGroups() {
        int[] habP1 = {2, 3, 1}; // [Fuerza, Agilidad, Constitución]
        Personaje p1 = new Personaje("Karye", Personaje.Raza.HUMANO, habP1);
        int[] habP2 = {1, 4, 2};
        Personaje p2 = new Personaje("Laxye", Personaje.Raza.ENANO, habP2);
        int[] habP3 = {1, 3, 8};
        Personaje p3 = new Personaje("Vinniet", Personaje.Raza.ELFO, habP3);
    }
}
