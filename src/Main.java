class Main{
    public static void main(String[] args) {

        System.out.println("============================================================");
        Cachorro mila = new Cachorro();
        mila.setNome("Mila");
        mila.abanarRabo();
        mila.correndo();
        mila.emitirSom();

        Gato piqui = new Gato();
        piqui.setNome("Piqui");
        piqui.arranharMoveis();
        piqui.brincando();
        piqui.emitirSom();

        System.out.println(mila.getNome() + " e " + piqui.getNome() + " estão brincando!");
        System.out.println("============================================================");

        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Samuel");
        c1.depositar(1500);
        c1.sacar(500);
        c1.setTarifa(0.2);
        c1.cobrarTarifaMensail();
        System.out.println(c1);
        System.out.println("============================================================");

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }
}