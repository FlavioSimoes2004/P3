public class Motorista extends Pessoa{
    private String placa_carro;
    private String cor_carro;
    private double nota;
    private double saldo;

    Motorista(String nome, int idade, String placa_carro){
        super(nome, idade);
        this.placa_carro = placa_carro;
    }

    public void aceitarCorrida(double a, double b, double c){
        setSaldo(a, b, c);
        System.out.println("Saldo deu: " + saldo);
    }

    public void setPlate(String placa){
        this.placa_carro = placa;
    }

    public String getPlate(){
        return placa_carro;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }

    public void setCor(String cor){
        this.cor_carro = cor;
    }

    public String getCor(){
        return cor_carro;
    }

    private void setSaldo(double a, double b, double c){
        double delta = b * b - 4 * a * c;
        delta = Math.sqrt(delta);

        double[] raizes = new double[2];
        raizes[0] = (-b + delta) / (2 * a);
        raizes[1] = (-b - delta) / (2 * a);

        setSaldo(raizes[0], raizes[1]);
    }

    private void setSaldo(double x1, double x2){
        if(x1 < 0 && x2 < 0)
        {
            throw new IllegalStateException("O saldo deu negativo");
        }
        else
        {
            if(x1 < 0)
            {
                this.saldo = x2;
            }
            else if(x2 < 0)
            {
                this.saldo = x1;
            }
            else
            {
                if(x1 < x2)
                {
                    this.saldo = x1;
                }
                else
                {
                    this.saldo = x2;
                }
            }
        }
    }

    public double getSaldo(){
        return saldo;
    }
}