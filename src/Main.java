class Main{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.falaMundo();

        Calculadora c1 = new Calculadora();
        System.out.println(c1.dobro(2));

        Musica m1 = new Musica();
        m1.titulo = "Garota de ipanema";
        m1.artista = "Tom Jobim";
        m1.anoLancamento = 1980;
        m1.avalia(10);
        m1.media();
        m1.avalia(8);
        m1.avalia(1);
        m1.avalia(10);
        m1.media();
        m1.fichaTecnica();

        Carro carro1 = new Carro();

        carro1.modelo = "Volkswagen Fox";
        carro1.ano = 2015;
        carro1.cor = "Azul";

        carro1.fichaTecnica();
        carro1.calculeIdade();



    }
}