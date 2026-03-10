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

        Aluno Duda = new Aluno();
        Duda.setNome("Duda");
        Duda.idade = 20;
        Duda.setNotas(8);
        Duda.setNotas(9);
        Duda.setNotas(10);
        Duda.getCalcularMedia();

        Duda.getExibeStatus();

        ContaBancaria CONTA1 = new ContaBancaria();

        CONTA1.setTitular("Samuel");
        CONTA1.setNumeroConta(00001);
        CONTA1.setDepositarSaldo(1600);
        CONTA1.getExibirStatus();

        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Ricardo");
        pessoa1.setIdade(50);
        pessoa1.getVerificaIdade();

        Produto xbox = new Produto();

        xbox.setNome("Xbox 360");
        xbox.setPreco(1500);
        xbox.aplicarDesconto(0.1);

        Livro l1 = new Livro();
        l1.setAutor("Machado de Assis");
        l1.setTitulo("Senhora");
        l1.exibirDetalhes();

    }
}