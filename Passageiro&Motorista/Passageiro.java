public class Passageiro extends Pessoa{
    private double nota;
    private String caracteristica;
    private double distance;

    Passageiro(String nome, int idade){
        super(nome, idade);
    }

    public void solicitarCorrida(Motorista motor){
        boolean solicitacao = motor.responderCorrida(distance);
        if(solicitacao == true)
        {
            System.out.println("Corrida aceita");
        }
        else
        {
            System.out.println("Corrida negada");
        }
    }

    public void setDistance(double distance){
        this.distance = distance;
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