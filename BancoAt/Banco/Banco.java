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
        if(occup >= contas.length)
        {
            increase();
        }

        contas[occup] = conta;
        occup++;
    }

    public void closeAcc(String num){
        Integer pos = getLocation(num);
        contas[pos] = null;

        for(int i = pos; i < occup; i++)
        {
            Conta aux = contas[i + 1];
            contas[i] = aux;
            contas[i + 1] = null;
        }

        occup--;
    }

    private void increase(){
        Conta[] newContas = new Conta[contas.length * 2];

        for(int i = 0; i < occup; i++)
        {
            newContas[i] = contas[i];
        }

        contas = newContas;
    }

    private Integer getLocation(String num){
        for(int i = 0; i < occup; i++)
        {
            if(contas[i].getNum().equals(num))
            {
                return i;
            }
        }

        return null;
    }
}