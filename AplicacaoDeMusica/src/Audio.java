public class Audio {
    //título, duração, total de reproduções, curtidas e classificação
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int curtidas;
    private double classificacao;


    public void ficha() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " Segundos");
        System.out.println("Total de Reproduções: " + totalDeReproducao);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);
        System.out.println("\n");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
}
