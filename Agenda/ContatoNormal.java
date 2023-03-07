import java.util.Calendar;
import java.util.GregorianCalendar;

public class ContatoNormal extends Contato{
    private int idade;
    private Calendar dtnasc;
    
    ContatoNormal(String nome){
        super(nome);
    }

    ContatoNormal(String nome, int idade){
        super(nome);
        this.idade = idade;
    }

    ContatoNormal(String nome, int idade, Calendar dtnasc){
        super(nome);
        this.idade = idade;
        this.dtnasc = dtnasc;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCalendar(Calendar dtnasc){
        this.dtnasc = dtnasc;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return super.nome;
    }

    public void getDados(){
        super.getDados();
        System.out.println("Idade: " + idade);
    }
}