package BancoAt.Banco;

public class Banco {
    private Conta[] contas;
    private int occup;
    private boolean increase;

    public Banco(boolean increase){
        contas = new Conta[10];
        this.increase = increase;
        occup = 0;
    }

    public Banco(int size, boolean increase){
        contas = new Conta[size];
        this.increase = increase;
        occup = 0;
    }

    public void addAcc(Conta conta){
        if(!increase && occup >= contas.length)
        {
            throw new IllegalStateException("Nao cabe mais contas");
        }
        else if(increase && occup >= contas.length)
        {
            increase();
        }

        contas[occup] = conta;
        occup++;
    }

    public void addAcc(String num, double money){
        Conta conta = new Conta(num, money);

        if(!increase && occup >= contas.length)
        {
            throw new IllegalStateException("Nao cabe mais contas");
        }
        else if(increase && occup >= contas.length)
        {
            increase();
        }

        contas[occup] = conta;
        occup++;
    }

    public void addAcc(String num){
        Conta conta = new Conta(num);
        
        if(!increase && occup >= contas.length)
        {
            throw new IllegalStateException("Nao cabe mais contas");
        }
        else if(increase && occup >= contas.length)
        {
            increase();
        }

        contas[occup] = conta;
        occup++;
    }

    private void increase(){
        Conta[] newContas = new Conta[contas.length * 2];

        for(int i = 0; i < occup; i++)
        {
            newContas[i] = contas[i];
        }

        contas = newContas;
    }

    public Integer getLocation(String num){
        for(int i = 0; i < occup; i++)
        {
            if(contas[i].getNum().equals(num))
            {
                return i;
            }
        }

        return null;
    }

    public void Sacar(Integer pos, double money){
        contas[pos].sacar(money);
    }

    public void Depositar(Integer pos, double money){
        contas[pos].depositar(money);
    }

    public void showAllAcc(){
        for(int i = 0; i < contas.length; i++)
        {
            System.out.println("Conta " + (i + 1));
            System.out.println("Numero: " + contas[i].getNum());
            System.out.println("Saldo: " + contas[i].showMoney() + "\n");
        }
    }
}