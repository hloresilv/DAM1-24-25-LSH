package ud5.herenciaejercicios;

public class Punto {
    private final int coordX;
    private final int coordY;

    public Punto(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    double distancia(Punto otroPunto) {
        if (otroPunto == null)
            throw new NullPointerException("El punto cardinal referenciado no puede ser null");

        return Math.sqrt(Math.pow(coordX - otroPunto.getCoordX(), 2) + Math.pow(coordY - otroPunto.getCoordY(), 2));
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return coordX == punto.coordX && coordY == punto.coordY; // correcto
    }
}
