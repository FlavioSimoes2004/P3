public abstract class Pessoa {
    private String nome;
    private int idade;
    private String telefone;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void changeName(String nome){
        this.nome = nome;
    }

    public String getName(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setPhone(String tel){
        this.telefone = tel;
    }

    public String getPhone(){
        return telefone;
    }
}