import java.util.ArrayList;

public class SuperContato{
    private String nome;
    private ArrayList<SuperTelefone> telefones;

    public SuperContato(String nome){
        this.nome = nome;
        telefones = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPhone(SuperTelefone tf){
        telefones.add(tf);
    }

    public void getDados(){
        System.out.println("Meu nome e " + nome);
        for(int i = 0; i < telefones.size(); i++)
        {
            System.out.println("Numero e tipo: " + telefones.get(i));
        }
    }
}