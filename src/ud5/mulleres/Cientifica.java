package ud5.mulleres;

public class Cientifica extends MullerTraballadora implements IPioneira {
    String descubrimento;

    public Cientifica(String nome, String apellidos, int anoNacemento, String descripcion) {
        super();
        this.descubrimento = descripcion;
    }

    @Override
    public void descricionContribucion() {
        System.out.println(nome + apellidos + " foi unha científica pioneira que descubriu: " + descubrimento);
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return descubrimento;
    }
}
