package BancoAt2;

abstract class Conta {
    protected String name, num;
    protected double saldo;

    public Conta(String name, String num){
        this.name = name;
        this.num = num;
        saldo = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNum(String num){
        this.num = num;
    }

    public String getName(){
        return name;
    }

    public String getNum(){
        return num;
    }

    public void sacar(double quant){
        if(saldo - quant >= 0)
        {
            saldo -= quant;
            System.out.println("Dinheiro sacado  com sucesso");
        }
        else
        {
            System.out.println("Nao foi possivel sacar a quantia");
        }
    }

    public void depositar(double quant){
        saldo += quant;
    }

    public double getSaldo(){
        return saldo;
    }
}