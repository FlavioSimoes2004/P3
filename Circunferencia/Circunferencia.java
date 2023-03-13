public class Circunferencia {
    private double ray;
    private Dot center;
    private double circunference;

    public Circunferencia(double ray, double x, double y){
        this.ray = ray;
        this.center = new Dot(x, y);
        setCircunference();
    }

    public Circunferencia(double ray, Dot center){
        this.ray = ray;
        this.center = center;
        setCircunference();
    }

    private void setCircunference(){
        circunference = 2 * Math.PI * ray;
    }

    public String verification(Dot ponto){
        double expression = Math.pow((ponto.getY() - center.getY()), 2) + Math.pow((ponto.getX() - center.getX()), 2);
        expression = Math.sqrt(expression);

        if(expression > ray)
        {
            return "Fora do circulo";
        }
        else if(expression < ray)
        {
            return "Dentro do circulo";
        }
        else
        {
            return "Igual ao raio";
        }
    }
}