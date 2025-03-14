package ud5.herenciaejercicios;

public class CajaCarton extends Caja {
    // saber superficie total de cartón utilizado
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.cm);
    }

    @Override
    double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    double getSuperficie() {
        return alto*ancho*2 + alto*fondo*2;
    }
}
