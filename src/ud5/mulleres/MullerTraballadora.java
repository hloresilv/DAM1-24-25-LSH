package ud5.mulleres;

public abstract class MullerTraballadora {
    public String nome;
    public String apellidos;
    public int anoNacemento;

    public abstract void descricionContribucion();

    // Pueden haber métodos implementados en la clase abstracta, al igual que constructores
    public int getIdade(int anoActual) {
        return anoActual - anoNacemento;
    }

    public static void main(String[] args) {
        // Instanciación de ud5.mulleres destacadas
        Cientifica marieCurie = new Cientifica("Marie", "Curie", 1867, "Descubriu o radio e o polonio");
        Artista fridaKahlo = new Artista("Frida", "Kahlo", 1907, "Surrealismo e pintura autobiográfica");
        Politica rosaParks = new Politica("Rosa", "Parks", 1913, "Loita polos dereitos civís e contra a segregación racial");
        Cientifica adaLovelace = new Cientifica("Ada", "Lovelace", 1815, "Primeira programadora da historia");
        // Array de Mulleres Traballadoras Destacadas
        MullerTraballadora[] mulleres = {marieCurie, fridaKahlo, rosaParks, adaLovelace};

        System.out.println("=== Mulleres Traballadoras Destacadas ===");
        for (MullerTraballadora muller : mulleres) {
            muller.descricionContribucion();
        }

        System.out.println("=== Detalles Específicos ===");
        System.out.println(marieCurie.getDescubrimentoOuAporte());
        System.out.println(rosaParks.getCausaDefendida());
        System.out.println(adaLovelace.getDescubrimentoOuAporte());

        Escritora virginiaWoolf = new Escritora("Virginia", "Woolf", 1882, "Orlando e Un cuarto  de seu");
        Deportista serenaWilliams = new Deportista("Serena", "Williams", 1981, "Ser a tenista  con máis títulos de Grand Slam na era aberta");
        Sindicalista claraCampoamor = new Sindicalista("Clara", "Campoamor", 1888, "Conseguíu o sufraxio feminino en España en 1931");

        MullerTraballadora[] mulleresActualizado = {marieCurie, fridaKahlo, rosaParks, adaLovelace, virginiaWoolf, serenaWilliams, claraCampoamor};
        for (MullerTraballadora muller : mulleresActualizado) {
            if (muller instanceof IPioneira) {
                IPioneira pioneira = (IPioneira) muller;
                System.out.println(muller.nome + " foi pioneira en: " + pioneira.getDescubrimentoOuAporte());
            }
            if (muller instanceof IActivista activista) {
                System.out.println(muller.nome + " defendeu a causa: " + activista.getCausaDefendida());
            }
        }
    }
}
