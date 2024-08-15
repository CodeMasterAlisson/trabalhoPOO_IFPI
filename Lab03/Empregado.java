package Lab03;

public class Empregado {

    private String matricula;
    private double valorHoraTrabalho;
    private int totalHoraMes;
    private int horaDia;

    public Empregado(String matricula, double valorHoraTrabalhadaMes) {
        this.matricula = matricula;
        this.valorHoraTrabalho = valorHoraTrabalhadaMes;
        this.totalHoraMes = 0;
    }

    public void registrarPonto(int horaChegada, int horaSaida){
        if (horaChegada < horaSaida){
            this.horaDia = (horaChegada - horaSaida);
            this.totalHoraMes += 30 * (horaSaida - horaChegada);
        } else {
            this.horaDia = ((24 - horaChegada) + horaSaida);
            this.totalHoraMes += 30 * (24 - horaChegada + horaSaida);
        }
    }

    public double calcularSalario(){
        double salario = valorHoraTrabalho * totalHoraMes;
        this.totalHoraMes = 0;
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getTotalHoraMes() {
        return totalHoraMes;
    }

    public int getHoraDia() {
        return horaDia;
    }
}
