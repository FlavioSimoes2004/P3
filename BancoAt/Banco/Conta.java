public class Conta{
    private String num;
    private double money;

    public Conta(String num, double money){
        this.money = money;
    }

    public void depositar(double quant){
        money += quant;
        System.out.println("Valor adicionado na conta");
    }

    public void sacar(double quant){
        if(money - quant < 0)
        {
            money -= quant;
            System.out.println("Valor sacado com sucesso");
        }
        else
        {
            System.out.println("Nao pode sacar um valor acima da conta");
        }
    }

    public String getNum(){
        return num;
    }
}