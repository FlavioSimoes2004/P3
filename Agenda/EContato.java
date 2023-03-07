import java.util.ArrayList;

public class EContato extends Contato{
    private String homepage;
    private ArrayList<String> emails;
    
    EContato(String nome){
        super(nome);
    }

    public void addEmail(String email){
        this.emails.add(email);
    }

    public void setHomepage(String homepage){
        this.homepage = homepage;
    }

    public String getHomepage(){
        return homepage;
    }

    public String getNome(){
        return super.nome;
    }

    public String getEmails(){
        String retorno = "";

        for(int i = 0; i < emails.size(); i++)
        {
            if(i == 0)
            {
                retorno = emails.get(i);
            }
            else
            {
                retorno = "\n" + emails.get(i);
            }
        }

        return retorno;
    }

    public void getDados(){
        super.getDados();
        System.out.println("Homepage: " + getHomepage());
        System.out.println("Emails: " + getEmails());
    }
}