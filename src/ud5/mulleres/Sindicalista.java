package ud5.mulleres;

public class Sindicalista extends MullerTraballadora implements IActivista {
    String movementoDefendido;

    public Sindicalista(String nome, String apellidos, int anoNacemento, String descripcion) {
        super();
        this.movementoDefendido = descripcion;
    }

    @Override
    public String getCausaDefendida() {
        return movementoDefendido;
    }

    @Override
    public void descricionContribucion() {
        System.out.println(nome + " " + apellidos + " foi unha sindicalista que defendeu: " + movementoDefendido);
    }
}
