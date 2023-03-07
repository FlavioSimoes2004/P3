import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nome, email;
        Telefone tel = new Telefone("732891");

        System.out.println("Nome: ");
        nome = in.next();
        System.out.println("Email");
        email = in.next();

        ContatoNormal contatoNormal = new ContatoNormal(nome);
        contatoNormal.setIdade(18);
        contatoNormal.getDados();
        contatoNormal.addPhone(tel);

        EContato eContato = new EContato(nome);
        eContato.addEmail(email);
        eContato.setHomepage("Seila");
        eContato.getDados();

        ContatoComercial comer = new ContatoComercial(nome);
        comer.setAtividade("TI");
        comer.setFuncionario("Empresa");
        comer.getDados();

        Agenda agenda = new Agenda();
        agenda.addContato(eContato);
        agenda.getContatos();
    }
}