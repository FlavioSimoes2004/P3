package ATV6Empregado;

abstract class Empregado {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected double salario;

    public Empregado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public void setNome(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double vencimento(){
        return salario;
    }
}