package Lab04;

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

    public void registrarPonto(int horaChegada, int horaSaida){

        int tempoDiaria =  horaSaida - horaChegada;
        if(tempoDiaria < 0){
            tempoDiaria += 24;
        }

        if (tempoDiaria > Empregado.cargaHorariaNormal){
            this.totalHoraMes += Empregado.cargaHorariaNormal;
            this.totalHorasExtrasMes += tempoDiaria - Empregado.cargaHorariaNormal;
        } else {
            this.totalHoraMes += tempoDiaria;
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

    public String getMatricula() {
        return matricula;
    }

    public int getTotalHoraMes() {
        return totalHoraMes;
    }

    public int getTotalHorasExtrasMes() {
        return totalHorasExtrasMes;
    }
}
