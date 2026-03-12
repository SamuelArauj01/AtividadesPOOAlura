public class ContaBancaria {
    private String titular;
    protected double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){

        if(valor <= 0) {
            System.out.println("Valor invalido!");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor <= 0 || valor > saldo){
            System.out.println("Acao invalida");
        } else {
            this.saldo -= valor;
        }
    }

    public double consultarSaldo(){
        return saldo;
    }
}
