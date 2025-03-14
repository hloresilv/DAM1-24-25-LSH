package ud5.praiasdegalicia;

public class Praia implements Comparable {
    private int id;
    private String nome;
    private String concello;
    private String provincia;
    private double lat;
    private double lon;

    @Override
    public String toString() {
        return id + " - " + getNome() + " - " + getConcello() + " - " + getProvincia().toUpperCase() + " - (" + getLat() + ", " + getLon() + ')';
    }

    @Override
    public int compareTo(Object o) {
        Praia p1 = ((Praia) o);
        return id - p1.id;
    }

    public String mostrarDetalle() {
        return "Detalles: " + toString();
    }

    public void imprimirLista(Praia[] praias, int numeroPraias) {
        System.out.println("PRAIAS ORDENADAS POR id\n=======================");
        for (int i = 0; i < praias.length; i++) {
            System.out.println(toString());
        }
    }

    public Praia() {
    }

    public Praia(int id) {
        this.id = id;
    }

    public Praia(int id, String nome, String concello, String provincia) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Praia(int id, String nome, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
