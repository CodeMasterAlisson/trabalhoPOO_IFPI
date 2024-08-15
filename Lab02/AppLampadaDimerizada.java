package Lab02;

import java.util.Scanner;

public class AppLampadaDimerizada {

    public static void main(String[] args) {

        LampadaDimerizada lampada = new LampadaDimerizada();
        Scanner sc = new Scanner(System.in);
        int opc, status;

       do {
           System.out.println("\t*********************");
           System.out.println("\tCONTROLE DE LÂMPADA");
           System.out.println("\t*********************");
           System.out.println("\t1 - Ligar lampada");
           System.out.println("\t2 - Desligar lampada");
           System.out.println("\t3 - Aumentar luminosidade");
           System.out.println("\t4 - Diminuir luminosidade");
           System.out.println("\t5 - Status lâmpada");
           System.out.println("\t6 - Sair");
           System.out.print("Entre com sua opção: ");
           opc = sc.nextInt();

           switch (opc) {
                case 1:
                    lampada.acender();
                    System.out.println("Lampada ligada");
                    break;
                case 2:
                    if (lampada.getLuminosidade() == 0){
                        System.out.println("Lampada não está ligada");
                    } else {
                        lampada.apagar();
                        System.out.println("Lampada apagada");
                    }
                   break;
                case 3:
                   lampada.aumentarLuminosidade();
                   break;
                case 4:
                    lampada.diminuirLuminosidade();
                    break;
                case 5:
                    status = lampada.getLuminosidade();
                    System.out.println((status != 0) ? "Lampada ligada" : "Lampada desligada");
                    break;
                case 6:
                    System.out.println("Programa encerrado!");
                   break;
               default:
                   System.out.println("Sua opção é inválida!");
           }
       } while (opc != 6);
       sc.close();
    }
}
