public class Musicas extends Audio {
    private String nomeDaBanda;
    private String generoMusical;
    private String album;

    public String getNomeDaBanda() {
        return nomeDaBanda;
    }

    public void setNomeDaBanda(String nomeDaBanda) {
        this.nomeDaBanda = nomeDaBanda;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void ficha() {
        System.out.println("Banda: " + nomeDaBanda);
        System.out.println("Gênero Musical: " + generoMusical);
        System.out.println("Álbum: " + album);
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() / 60 + " Minutos");
        System.out.println("Total de Reproduções: " + getTotalDeReproducao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("\n");
    }
}
