package Lab03;

import java.util.Scanner;

public class AppEmpregado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empregado empregado = null;
        int op, horaInicial, horaFinal;
        String matricula;
        double valor;

        do {
            System.out.println("\t CONTROLE DE PAGAMENTO");
            System.out.println("\t 1 - Cadastrar Empregado");
            System.out.println("\t 2 - Registrar Ponto");
            System.out.println("\t 3 - Calcular salário");
            System.out.println("\t 4 - Fechar Programa");
            System.out.print("Entre com sua opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Entre com a matrícula: ");
                    matricula = sc.next();
                    System.out.println("Entre com a valor: ");
                    valor = sc.nextDouble();
                    empregado = new Empregado(matricula,valor);
                    System.out.println("Empregado de matricula " + empregado.getMatricula() + " cadastrado com sucesso!");
                    break;

                case 2:
                    if (empregado != null){
                        System.out.println("Entre com a hora inicial: ");
                        horaInicial = sc.nextInt();
                        System.out.println("Entre com a hora final: ");
                        horaFinal = sc.nextInt();
                        empregado.registrarPonto(horaInicial, horaFinal);
                        System.out.printf("\n\tRegistro de horas\n");
                        System.out.printf("Matricula: %s | tenpo: %d horas/mês | %d hora/dia\n\n", empregado.getMatricula(), empregado.getTotalHoraMes(), empregado.getHoraDia());
                    } else {
                        System.out.println("Não há empregado cadastrado!");
                    }
                    break;

                case 3:
                    if (empregado != null){
                        System.out.printf("\n\tFolha de Pagamento\n");
                        System.out.printf("Matrícula: %s | Salário: R$ %,.2f\n", empregado.getMatricula(), empregado.calcularSalario());
                    } else {
                        System.out.println("Não há empregado cadastrado!");
                    }
                    break;

                case 4:
                    System.out.println("Programa Encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 4);
    }
}
