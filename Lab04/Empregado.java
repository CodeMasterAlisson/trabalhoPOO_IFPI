package Lab04;

public class Empregado {

    private static final int HORA_NORMAL = 8;
    private String matricula;
    private double valorHoraTrabalho;
    private int totalHoraMes;
    private int totalHorasExtrasMes;

    public Empregado(String matricula, double valorHoraTrabalhadaMes) {
        this.matricula = matricula;
        this.valorHoraTrabalho = valorHoraTrabalhadaMes;
        this.totalHoraMes = 0;
    }

    public void registrarPonto(int horaChegada, int horaSaida){
        if (horaChegada < horaSaida){
            this.totalHoraMes += (horaSaida - horaChegada);
            if (totalHoraMes > 8){
                this.totalHorasExtrasMes = totalHoraMes - HORA_NORMAL;
            }
        } else {
            this.totalHoraMes += ((24 - horaChegada) + horaSaida);
            if (totalHoraMes > 8){
                this.totalHorasExtrasMes = totalHoraMes - HORA_NORMAL;
            }
        }
    }

    public double calcularSalario(){
        double salario = 0.0;

        if (this.totalHorasExtrasMes != 0){
            salario = (valorHoraTrabalho * 1.5) * totalHoraMes;
            this.totalHoraMes = 0;
            this.totalHorasExtrasMes = 0;
        } else {
            salario = valorHoraTrabalho * totalHoraMes;
            this.totalHoraMes = 0;
            this.totalHorasExtrasMes = 0;
        }
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getTotalHoraMes() {
        return totalHoraMes;
    }

}
