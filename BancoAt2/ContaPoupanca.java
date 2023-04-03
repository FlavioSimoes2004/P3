package BancoAt2;

public class ContaPoupanca extends Conta{

    private int diaRend;

    public ContaPoupanca(String name, String num, int diaRend){
        super(name, num);
        this.diaRend = diaRend;
    }

    public void atualizar(double taxaRend){
        this.saldo = saldo + (saldo * taxaRend);
    }
}