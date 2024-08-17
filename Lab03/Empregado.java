package Lab03;

public class Empregado {

    private static final int cargaHorariaNormal = 8;
    private String matricula;
    private double valorHoraTrabalho;
    private int totalHoraMes;
    private int totalHorasExtrasMes;

    public Empregado(String matricula, double valorHoraTrabalhadaMes) {
        this.matricula = matricula;
        this.valorHoraTrabalho = valorHoraTrabalhadaMes;
        this.totalHoraMes = 0;
        this.totalHorasExtrasMes = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getTotalHoraMes() {
        return this.totalHoraMes;
    }

    public int getTotalHorasExtrasMes() {
        return this.totalHorasExtrasMes;
    }

    public void registrarPonto(int horaChegada, int horaSaida){

        // estou considerando nessa questão que o empregado faz hora extra durante os 30 dias de trabalho
        // por isso multiplico por 30
        // dias normais multiplico a diaria por 30 dias

        int tempoDiaria =  horaSaida - horaChegada;
        if(tempoDiaria < 0){
            tempoDiaria += 24;
        }

        if (tempoDiaria > Empregado.cargaHorariaNormal){
            this.totalHoraMes = 30 * (Empregado.cargaHorariaNormal);
            this.totalHorasExtrasMes = 30 * (tempoDiaria - Empregado.cargaHorariaNormal);
        } else {
            this.totalHoraMes = 30 * tempoDiaria;
        }
    }

    public double calcularSalario(){
        double salario=0.0;
        double adicional=0.0;
        double salarioLiquido = 0.0;
        if (this.totalHorasExtrasMes != 0){
            salario = this.totalHoraMes * this.valorHoraTrabalho;
            adicional = this.totalHorasExtrasMes * this.valorHoraTrabalho * 1.5;
            salarioLiquido = salario + adicional;
        } else {
            salarioLiquido = this.totalHoraMes * this.valorHoraTrabalho;
        }
        this.totalHoraMes=0;
        this.totalHorasExtrasMes=0;
        
        return salarioLiquido;
    }


    public void adicionarHora(int hora){
        // adiciona as horas normais
        this.totalHoraMes += hora;
    }
    
    public void retirarHora(int hora){
        // retira das horas normais
        this.totalHoraMes -= hora;
    }

    public void transferirHoras(int hora, Empregado empregado){
        this.retirarHora(hora);
        empregado.adicionarHora(hora);
    }
}
