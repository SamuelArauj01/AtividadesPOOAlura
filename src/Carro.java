public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.println("Modelo = " + modelo);
        System.out.println("Cor = " + cor);
        System.out.println("Ano = " + ano);
    }

    void calculeIdade(){
        int idade = 2026 - ano;
        System.out.println(idade + " anos");
    }
}
