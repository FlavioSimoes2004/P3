package BancoAt2;

import java.util.Scanner;

public class Contas {

    static public Conta[] multiContas;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        multiContas = new Conta[100];
        int escolha;
        int occup = 0;
        double quant;
        String name, num;

        do
        {
            MENU1();
            escolha = in.nextInt();
            if(escolha == 1)
            {
                MENU2();
                escolha = in.nextInt();
                switch(escolha)
                {
                    case 1:
                        name = in.next();
                        num = in.next();
                        multiContas[occup] = new ContaPoupanca(name, num, occup);
                        occup++;
                    break;

                    case 2:
                        quant = in.nextDouble();
                        num = in.next();
                        int pos = findPos(num);
                        if(pos != -1)
                        {
                            multiContas[pos].sacar(quant);
                        }
                    break;

                    case 3:
                        quant = in.nextDouble();
                        num = in.next();
                        int pos2 = findPos(num);
                        if(pos2 != -1)
                        {
                            multiContas[pos2].depositar(quant);
                        }
                    break;

                    case 4:
                        showContas();
                    break;

                    case 5:
                        //to com preguica de fazer pq e muita coisa
                        System.out.println("Valores atualizados");
                    break;

                    default:
                        System.out.println("Opcao invalida");
                    break;
                }
            }
            else if(escolha == 2)
            {
                MENU2();
                escolha = in.nextInt();
            }
            else if(escolha != 0)
            {
                System.out.println("Escolha invalida");
            }            
        }
        while(escolha != 0);
    }

    public static void showContas(){
        for(int i = 0; i < multiContas.length; i++)
        {
            if(multiContas[i] != null)
            {
                System.out.println("Conta " + (i + 1));
                {
                    System.out.println("Saldo = " + multiContas[i].getSaldo());
                }
            }
        }
    }

    public static int findPos(String num){
        for(int i = 0; i < multiContas.length; i++)
        {
            if(multiContas[i].getNum() == num)
            {
                return i;
            }
        }

        return -1;
    }

    public static void MENU1(){
        System.out.println("0 - Fechar programa");
        System.out.println("1 - Conta poupanca");
        System.out.println("2 - Conta especial");
        System.out.println("Escolha: ");
    }

    public static void MENU2(){
        System.out.println("1- cadastrar");
        System.out.println("2- Sacar");
        System.out.println("3- Depositar");
        System.out.println("4- Mostrar saldo das contas");
        System.out.println("5- Atualizar todos os valores");
        System.out.println("Escolha: ");
    }
}