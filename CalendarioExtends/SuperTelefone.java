public class SuperTelefone {
    private String numero, tipo;

    public SuperTelefone(){
        this.numero = "(Nao preenchido)";
        this.tipo = "(Nao preenchido)";
    }

    public SuperTelefone(String numero){
        this.numero = numero;
        this.tipo = "(Nao preenchido)";
    }

    public SuperTelefone(String numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTelefone(){
        return numero + " " + tipo;
    }
}