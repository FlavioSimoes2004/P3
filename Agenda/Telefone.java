public class Telefone {
    protected String numero;
    protected String tipo = "Tipo nao especificado";

    Telefone(String numero){
        this.numero = numero;
    }

    Telefone(String numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNum(){
        return numero;
    }

    public String printTelefone(){
        return "Numero: " + numero + " " + tipo;
    }
}