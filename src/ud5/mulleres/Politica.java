package ud5.mulleres;

public class Politica extends MullerTraballadora implements IActivista {
    String causa;

    public Politica(String nome, String apellidos, int anoNacemento, String descripcion) {
        super();
        this.causa = descripcion;
    }

    @Override
    public void descricionContribucion() {
        System.out.println(nome + apellidos + " foi unha política e activista destacada por: " + causa);
    }

    @Override
    public String getCausaDefendida() {
        return causa;
    }
}
