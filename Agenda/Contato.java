import java.util.ArrayList;
import java.util.ArrayList;

public class Contato{
    protected String nome;
    protected ArrayList<Telefone> telefones;

    Contato(String nome){
        this.nome = nome;
    }

    public void changeName(String nome){
        this.nome = nome;
    }

    public void addPhone(Telefone tel){
        telefones.add(tel);
    }

    public void getDados(){
        System.out.println("Nome: " + nome);
        for(int i = 0; i < telefones.size(); i++)
        {
            System.out.println(telefones.get(i).printTelefone());
        }
    }
}