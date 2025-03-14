package ud5.herenciaejercicios;

import java.util.Arrays;

public class Caja {
    final int ancho;
    final int alto;
    final int fondo;
    enum Unidad {cm, m}
    final Unidad unidad;
    char[] etiqueta = new char[30]; // nombre del destinatario, dirección, etc

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        if (ancho <= 0 || alto <= 0 || fondo <= 0)
            throw new IllegalArgumentException("Anchura, altura o fondo no válido");

        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    double getVolumen() {
        if (unidad == Unidad.cm) {
            return (double) (ancho * alto * fondo) /1000;
        }
        return (double) (ancho * alto * fondo);
    }

    void setEtiqueta(String etiqueta) {
        if (etiqueta == null || etiqueta.length() > 30) return;

        char[] etiquetaChar = etiqueta.toCharArray();

        System.arraycopy(etiquetaChar, 0, this.etiqueta, 0, etiquetaChar.length);
    }

    @Override
    public String toString() {
        String str = "Caja -> " + "etiqueta: ";
        if (etiqueta != null)
            str += Arrays.toString(etiqueta);
        else
            str += "null";

        return str;
    }
}
