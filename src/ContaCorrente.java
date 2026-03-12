public class ContaCorrente extends ContaBancaria{
    private double tarifa;

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;

    }

    public void cobrarTarifaMensail(){
        saldo -= (saldo * tarifa);
    }

    @Override
    public String toString(){
        return " ContaCorrente {Titular = " + getTitular() + " Saldo = " + "R$" + saldo + "}";
    }
}
