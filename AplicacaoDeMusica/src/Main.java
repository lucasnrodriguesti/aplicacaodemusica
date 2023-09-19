public class Main {
    public static void main(String[] args) {

        Audio favorito = new Audio();
        favorito.setTitulo("SNK");
        favorito.setDuracao(15);
        favorito.setTotalDeReproducao(1200);
        favorito.setCurtidas(777);
        favorito.setClassificacao(9.8);
        favorito.ficha();

        Podcasts canal = new Podcasts();
        canal.setTitulo("ChatGPT no Robô, será o início de uma Nova Era?");
        canal.setNomeDoCanal("Alura");
        canal.setNomeDoApresentador("Paulo Silveira");
        canal.setCategoria("Tecnologia");
        canal.setDuracao(2444);
        canal.setTotalDeReproducao(5000);
        canal.setCurtidas(3057);
        canal.setClassificacao(8.5);
        canal.ficha();

        Musicas linkinPark = new Musicas();
        linkinPark.setTitulo("In the End");
        linkinPark.setNomeDaBanda("Linkin Park");
        linkinPark.setGeneroMusical("Nu Metal");
        linkinPark.setAlbum("Meteora");
        linkinPark.setDuracao(244);
        linkinPark.setTotalDeReproducao(98639990);
        linkinPark.setCurtidas(9917823);
        linkinPark.setClassificacao(10);
        linkinPark.ficha();

    }
}
