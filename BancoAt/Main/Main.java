package BancoAt.Main;

import BancoAt.Banco.Banco;
import java.util.*;

public class Main {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Banco banco = new Banco(true);
        int esc;
        String num;
        Integer pos;
        double value;

        do
        {
            Menu();
            esc = in.nextInt();
            switch(esc)
            {
                case 0:
                    System.out.println("Fechando programa");
                break;

                case 1:
                    System.out.println("Coloque o CPF: ");
                    num = in.next();
                    banco.addAcc(num);
                break;

                case 2:
                    System.out.println("Coloque o CPF: ");
                    num = in.next();
                    pos = banco.getLocation(num);

                    System.out.println("Valor para sacar: ");
                    value = in.nextDouble();
                    banco.Sacar(pos, value);
                break;

                case 3:
                    System.out.println("Coloque o CPF: ");
                    num = in.next();
                    pos = banco.getLocation(num);

                    System.out.println("Valor para sacar: ");
                    value = in.nextDouble();
                    banco.Depositar(pos, value);
                break;

                case 4:
                    banco.showAllAcc();
                break;

                case 5:
                    banco.poupanca();
                break;

                default:
                    System.out.println("Escolha invalida");
                break;
            }
        }
        while(esc != 0);
    }

    public void Menu(){
        System.out.println("0- Fechar");
        System.out.println("1- cadastrar");
        System.out.println("2- Sacar");
        System.out.println("3- Depositar");
        System.out.println("4- Mostrar saldo das contas");
        System.out.println("5- Atualizar todos os valores");
        System.out.println("Escolha: ");
    }
}