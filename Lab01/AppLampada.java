package Lab01;

import java.util.Scanner;

public class AppLampada {

    public static void main(String[] args) {

        LampadaTresEstados lampada = new LampadaTresEstados();
        Scanner sc = new Scanner(System.in);

        int opc;

       do {
           System.out.println("\t*********************");
           System.out.println("\tCONTROLE DE LÂMPADA");
           System.out.println("\t*********************");
           System.out.println("\t1 - Ligar lampada");
           System.out.println("\t2 - Meia luz");
           System.out.println("\t3 - Desligar lampada");
           System.out.println("\t4 - Sair");
           System.out.print("Entre com sua opção: ");
           opc = sc.nextInt();

           switch (opc) {
                case 1:
                    lampada.acender();
                    System.out.println(lampada.getEstado());
                    break;
                case 2:
                    lampada.meiaLuz();
                    System.out.println(lampada.meiaLuz());
                    break;
               case 3:
                    lampada.apagar();
                   System.out.println(lampada.getEstado());
                   break;
               case 4:
                   System.out.println("Programa encerrado!");
                   break;
               default:
                   System.out.println("Sua opção é inválida!");
           }
       } while (opc != 4);
       sc.close();
    }
}
