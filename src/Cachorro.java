public class Cachorro extends Animal{
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void correndo(){
        System.out.println( nome + " está correndo");
    }

    public void abanarRabo(){
        System.out.println( nome + " está abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo");
    }
}
