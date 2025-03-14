package ud5.mulleres;

public class Escritora extends MullerTraballadora implements IPioneira {
    String obraMaestra;

    public Escritora(String nome, String apellidos, int anoNacemento, String descripcion) {
        super();
        this.obraMaestra = descripcion;
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return obraMaestra;
    }

    @Override
    public void descricionContribucion() {
        System.out.println(nome + " " + apellidos + " foi unha escrita que fixo: " + obraMaestra);
    }
}
