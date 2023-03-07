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
        boolean found = false;
        for(int i = 0; i < contatos.size(); i++)
        {
            EContato contato = contatos.get(i);
            if(contato.getNome().equals(nome))
            {
                contato.getDados();
                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("Nao encontrado");
        }
    }

    public void searchEmail(String email){
        boolean found = false;
        
        for(int i = 0; i < contatos.size(); i++)
        {
            EContato contato = contatos.get(i);
            if(contato.compareEmail(email) == true)
            {
                contato.getDados();
                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("Nao encontrado");
        }
    }
}