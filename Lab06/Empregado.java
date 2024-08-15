package Lab06;

public class Empregado {
    
    private static final int HORA_NORMAL = 8;
    private String nome;
    private double valorHoraTrabalho;
    private int totalHorasMes;
    private int totalHorasExtrasMes;

    public Empregado(){

    }

    public Empregado(String matricula, double valorHoraTrabalho){
        this.nome = matricula;
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public void registrarPonto(int horaChegada, int horaSaida){
        if(horaChegada < horaSaida){
            totalHorasMes += (horaSaida - horaChegada);
            if (totalHorasMes > 8){
                this.totalHorasExtrasMes = totalHorasMes - HORA_NORMAL;
            }
        } else {
            totalHorasMes = ((24 - horaChegada) + horaSaida);
            if (totalHorasMes > 8){
                this.totalHorasExtrasMes = totalHorasMes - HORA_NORMAL;
            }
        }
    }

    public double calcularSalario(){
        double salario = 0.0;
        if (totalHorasExtrasMes != 0){
            salario += (totalHorasExtrasMes * valorHoraTrabalho * 1.5) + (HORA_NORMAL * valorHoraTrabalho);
        } else {
            salario = valorHoraTrabalho * totalHorasMes;
        }

        this.totalHorasMes = 0;
        this.totalHorasExtrasMes = 0;

        return salario;
    }

    public void adicionarHora(int hora){
        totalHorasMes += hora;
    }

    public void retirarHora(int hora){
        totalHorasMes -= hora;
    }
    public void transferirHoras(int hora, Empregado empregado){
        this.retirarHora(hora);
        empregado.adicionarHora(hora);
    }

    public int getTotalHorasMes() {
        return totalHorasMes;
    }

    // só essa questão resolvi criar o metodo main junto com classe modelo, mas nao é o correto
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("701", 6.50);
        Empregado empregado2 = new Empregado("702", 5.00);

        empregado1.registrarPonto(7, 17);
        empregado2.registrarPonto(8, 15);

        System.out.println("Hora original empregado 1: " + empregado1.getTotalHorasMes());
        System.out.println("Hora original empregado 2: " + empregado2.getTotalHorasMes());
        empregado1.transferirHoras(2, empregado2);
        System.out.println("Hora restante empregado 1: " + empregado1.getTotalHorasMes());
        System.out.println("Hora aumentada empregado 2:  " + empregado2.getTotalHorasMes());


        System.out.println("Salario empregado 1: R$ " + empregado1.calcularSalario());
        System.out.println("Salario empregado 2: R$ " + empregado2.calcularSalario());

        System.out.println("Salario zerado: " + empregado1.calcularSalario());
        System.out.println("Salario zerado: " + empregado2.calcularSalario());
    }
}
