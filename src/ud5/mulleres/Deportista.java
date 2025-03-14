package ud5.mulleres;

public class Deportista extends MullerTraballadora implements IPioneira {
    String fitoHistorico;

    public Deportista(String nome, String apellidos, int anoNacemento, String descripcion) {
        super();
        this.fitoHistorico = descripcion;
    }

    @Override
    public String getDescubrimentoOuAporte() {
        return fitoHistorico;
    }

    @Override
    public void descricionContribucion() {
        System.out.println(nome + apellidos + " foi unha deportista que: " + fitoHistorico);
    }
}
