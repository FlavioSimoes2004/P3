import java.util.ArrayList;

public class Agenda{
    private ArrayList<EContato> contatos;

    public void addContato(EContato contato){
        contatos.add(contato);
    }

    public int getQuant(){
        return contatos.size();
    }

    public void searchName(String nome){
        for(int i = 0; i < contatos.size(); i++)
        {
            EContato contato = contatos.get(i);
            if(contato.getNome().equals(nome))
            {
                System.out.println(contato.getDados());
            }
        }

        System.out.println("Nao encontrado");
    }

    public void searchEmail(String email){
        for(int i = 0; i < contatos.size(); i++)
        {
            
        }
    }
}