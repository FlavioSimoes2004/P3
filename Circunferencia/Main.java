public class Main {
    public static void main(String args[]){
        Circunferencia cir = new Circunferencia(12, 0, 0);
        Dot ponto = new Dot(0, -7);
        System.out.println(cir.verification(ponto));
    }
}