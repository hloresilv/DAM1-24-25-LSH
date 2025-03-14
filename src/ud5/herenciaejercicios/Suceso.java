package ud5.herenciaejercicios;

import java.util.Objects;

public class Suceso extends Punto3D {
    int tiempo;
    String descripcion;

    public Suceso(int coordX, int coordY, int coordZ, int tiempo, String descripcion) {
        super(coordX, coordY, coordZ);
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Suceso suceso = (Suceso) o;
        return tiempo == suceso.tiempo && Objects.equals(descripcion, suceso.descripcion);
    }
}
