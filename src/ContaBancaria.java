public class ContaBancaria {
    public String titular;
    private int numeroConta;
    private double saldo;

    public void setDepositarSaldo(double valor){
        saldo += valor;
    }

    public void setTitular(String nome){
        titular = nome;
    }

    public void setNumeroConta(int numero){
        numeroConta = numero;
    }

    public void getExibirStatus(){
        System.out.println(String.format("""
                Titular = %s
                Numero da Conta = %d
                Saldo = R$ %.2f
                """, titular, numeroConta, saldo));
    }
}
