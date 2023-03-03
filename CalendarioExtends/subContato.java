import java.util.Calendar;
import java.util.GregorianCalendar;

public class subContato extends SuperContato{
    private int idade;
    private Calendar dtnasc;

    public subContato(String nome, int idade){
        super(nome);
        this.idade = idade;
    }

    public void getDados(){
        super.getDados();
        System.out.println("Tem: " + idade);
        //System.out.println("Dia: " + dtnasc.get(Calendar.DATE) + ", mes: " + dtnasc.get(Calendar.MONTH) + ", ano: " + dtnasc.get(Calendar.YEAR));
    }
}