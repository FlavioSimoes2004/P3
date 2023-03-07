public class ContatoComercial extends Contato{
    private String atividade, funcionario;
    
    ContatoComercial(String nome){
        super(nome);
    }

    public void setAtividade(String at){
        atividade = at;
    }

    public void setFuncionario(String fun){
        funcionario = fun;
    }

    public String getAtiv(){
        return atividade;
    }

    public String getFun(){
        return funcionario;
    }

    public void getDados(){
        super.getDados();
        System.out.println("Atividade: " + atividade);
        System.out.println("Funcionario: " + funcionario);
    }
}