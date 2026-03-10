public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void getVerificaIdade(){
        if(idade < 18){
            System.out.println(nome + " eh menor de idade");
        } else {
            System.out.println(nome + " eh maior de idade");
        }
    }
}
