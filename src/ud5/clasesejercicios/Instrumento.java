package ud5.clasesejercicios;

import java.util.Arrays;

public abstract class Instrumento {
    enum Nota {DO, RE, MI, FA, SOL, LA, SI}

    Nota[] melodia;

    public Instrumento(Nota[] melodia) {
        this.melodia = melodia;
    }

    public void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    abstract public void interpretar();
}
