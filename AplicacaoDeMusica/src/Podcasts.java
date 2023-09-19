public class Podcasts extends Audio {
    private String nomeDoApresentador;
    private String nomeDoCanal;
    private String categoria;

    public String getNomeDoApresentador() {
        return nomeDoApresentador;
    }

    public void setNomeDoApresentador(String nomeDoApresentador) {
        this.nomeDoApresentador = nomeDoApresentador;
    }

    public String getNomeDoCanal() {
        return nomeDoCanal;
    }

    public void setNomeDoCanal(String nomeDoCanal) {
        this.nomeDoCanal = nomeDoCanal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void ficha() {
        System.out.println("Apresentador: " + nomeDoApresentador);
        System.out.println("Canal: " + nomeDoCanal);
        System.out.println("Categoria: " + categoria);
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() / 60 + " Minutos");
        System.out.println("Total de Reproduções: " + getTotalDeReproducao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("\n");
    }
}
