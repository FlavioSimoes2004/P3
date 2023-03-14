import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double ray = in.nextDouble();
        System.out.print("Digite o X do ponto central: ");
        double x = in.nextDouble();
        System.out.print("Digite o Y do ponto central: ");
        double y = in.nextDouble();
        Circunferencia cir = new Circunferencia(ray, x, y);

        for(int i = 1; i <= 5; i++)
        {
            System.out.print("Digite o Y do ponto de referencia: ");
            x = in.nextDouble();
            System.out.print("Digite o Y do ponto de referencia: ");
            y = in.nextDouble();
            Dot ponto = new Dot(x, y);
            cir.verification(ponto);
        }
    }
}