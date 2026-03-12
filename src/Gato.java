public class Gato extends Animal{
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void brincando(){
        System.out.println(nome + " está brincando por aí");
    }

    public void arranharMoveis(){
        System.out.println(nome + " está arranhando os móveis");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando");
    }
}
