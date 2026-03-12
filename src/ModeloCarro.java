public class ModeloCarro extends Carro {
    private String marca;
    private String cor;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void fichaTecnica(){
        System.out.println("-------------------------");
        System.out.println("Modelo -> " + getModelo());
        System.out.println("Marca -> " + getMarca());
        System.out.println("Ano -> " + getAno());
        System.out.println("Cor -> " + getCor());
        System.out.println("-------------------------");
    }
}

