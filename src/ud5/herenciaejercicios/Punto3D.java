package ud5.herenciaejercicios;

public class Punto3D extends Punto {
    private final int coordZ;

    public Punto3D(int coordX, int coordY, int coordZ) {
        super(coordX, coordY);
        this.coordZ = coordZ;
    }

    public int getCoordZ() {
        return coordZ;
    }

    @Override // También podría ser hecho mediante function overloading
    double distancia(Punto otroPunto) {
        if (otroPunto == null)
            throw new NullPointerException("El punto cardinal referenciado no puede ser null");

        return Math.sqrt((Math.pow(super.getCoordX() - otroPunto.getCoordX(), 2) +
               Math.pow(super.getCoordY() - otroPunto.getCoordY(), 2)));
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Punto3D punto3D = (Punto3D) o;
        return coordZ == punto3D.coordZ; // correcto
    }
}
