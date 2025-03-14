package ud5.clasesejercicios;

// E0802
public class HoraExacta extends Hora {
    byte segundo;
    public HoraExacta(byte hora, byte minuto, byte segundos) {
        super(hora, minuto);
        segundo = segundos;
    }

    public void setSegundo(byte segundo) {
        if (segundo < 0 || segundo > 60)
            return;
        this.segundo = segundo;
    }

    public void inc() {
        if (segundo >= 60) {
            segundo = 0;
            super.inc();
        }
    }

 // E0803
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HoraExacta that = (HoraExacta) o;
        return hora == that.hora && minuto == that.minuto && segundo == that.minuto;
    }
}
