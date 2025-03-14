package ud5.clasesejercicios;

// E0801

public class Hora {
    byte hora;
    byte minuto;

    public Hora(byte hora, byte minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }
    }

    boolean setMinuto (byte minuto) {
        if (minuto < 0 || minuto > 59)
            return false;

        this.minuto = minuto;
        return true;
    }

     boolean setHora (byte hora) {
        if (hora < 0 || hora > 23)
            return false;

        this.hora = hora;
        return true;
     }

    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                '}';
    }
}
