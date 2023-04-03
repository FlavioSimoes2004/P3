package BancoAt2;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(String name, String num, double limite){
        super(name, num);
        this.limite = limite;
    }

    public void sacar(double quant){
        if(this.saldo - quant >= limite)
        {
            this.saldo -= quant;
            System.out.println("Saque feito com sucesso");
        }
        else
        {
            System.out.println("Nao foi possivel sacar");
        }
    }
}