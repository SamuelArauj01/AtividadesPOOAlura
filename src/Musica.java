public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao = 0;
    char numAvaliacoes;

    void avalia(int num){
        avaliacao += num;
        numAvaliacoes++;
    }

    double media(){
        return  avaliacao/numAvaliacoes;
    }

    void fichaTecnica(){
        System.out.println("O titulo da obra eh " + titulo + " do(a) artista " + artista + " lancada em " + anoLancamento + " com a avaliacao de " + media());
    }
}
