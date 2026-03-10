public class Aluno {
    private String nome;
    public int idade;
    private double notas = 0;
    private double media;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        quantidade++;
    }

    public void getCalcularMedia(){
        media = (notas / quantidade);
        System.out.println(String.format("A media do(a) %s eh = %.2f", nome, media));
    }

    public void getExibeStatus(){
        System.out.println("O(A) aluno(a) " + nome + " tem " + idade + " ano(s)");
    }
}
