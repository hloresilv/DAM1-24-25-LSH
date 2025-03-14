package ud5.mulleres;

public class Artista extends MullerTraballadora {
    String estilo;

    public Artista(String nome, String apellidos, int anoNacemento, String descripcion) {
        super();
        this.estilo = descripcion;
    }

    @Override
    public void descricionContribucion() {
        System.out.println(nome + apellidos + " destacou no arte co estilo: " + estilo);
    }
}
