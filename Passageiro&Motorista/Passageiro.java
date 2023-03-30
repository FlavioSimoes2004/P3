public class Passageiro extends Pessoa{
    private double nota;
    private String caracteristica;

    Passageiro(String nome, int idade){
        super(nome, idade);
    }

    public boolean solicitarCorrida(){
        return true;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }

    public void setCar(String car){
        this.caracteristica = car;
    }

    public String getCar(){
        return caracteristica;
    }
}