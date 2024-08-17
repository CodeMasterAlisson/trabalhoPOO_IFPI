package Lab03;

public class AppEmpregado {

    public static void main(String[] args) {

        // QUESTÃO 03 e 04
        Empregado empregado = new Empregado("2024001", 8.50);

        empregado.registrarPonto(8, 16);
        System.out.printf("\n Total hora normal mes: %d", empregado.getTotalHoraMes());
        System.out.printf("\n Total hora extra mes: %d", empregado.getTotalHorasExtrasMes());
        System.out.printf("\n Primeiro salário do mês R$ %,3.2f \n", empregado.calcularSalario());
        System.out.printf("\n Salario zerado apos novo calculo R$ %.2f \n", empregado.calcularSalario());
        
        
        empregado.registrarPonto(7, 17); 
        // aqui gera um novo salário ao chamar o metodo calcular

        // testando o metodo transferencia de horas

        Empregado empregadoJoao = new Empregado("20247008", 8.50);
        Empregado empregadaJulia = new Empregado("20247008", 8.50);

        empregadoJoao.registrarPonto(8, 15);
        empregadaJulia.registrarPonto(8, 12);

        System.out.printf("\n Empregado João %d horas normais ", empregadoJoao.getTotalHoraMes());
        System.out.printf("\n Empregado João %d horas extras ", empregadoJoao.getTotalHorasExtrasMes());
        System.out.printf("\n Empregado João: Total de horas %d  \n", empregadoJoao.getTotalHoraMes() + empregadoJoao.getTotalHorasExtrasMes());

        System.out.printf("\n Empregada Julia %d horas normais ", empregadaJulia.getTotalHoraMes());
        System.out.printf("\n Empregada Julia %d horas extras ", empregadaJulia.getTotalHorasExtrasMes());
        System.out.printf("\n Empregada Julia: Total de horas %d  \n", empregadaJulia.getTotalHoraMes() + empregadaJulia.getTotalHorasExtrasMes());

        empregadoJoao.transferirHoras(10, empregadaJulia);
        System.out.printf("\n Hora atualizada - Empregado Joao %d ", empregadoJoao.getTotalHoraMes());
        System.out.printf("\n Hora atualizada - Empregada Julia  %d \n\n", empregadaJulia.getTotalHoraMes());

        System.out.println(" Empregado Joao R$ " + empregadoJoao.calcularSalario());
        System.out.println(" Empegada Julia R$ " + empregadaJulia.calcularSalario());

    }
}
