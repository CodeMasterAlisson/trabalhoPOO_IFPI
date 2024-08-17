package Lab02;

public class LampadaDimerizada {

    private int luminosidade;

    public LampadaDimerizada() {
        apagar();
    }

    public void apagar(){
        luminosidade = 0;
    }

    public void acender(){
        luminosidade = 100;
    }

    public void aumentarLuminosidade(){
        this.luminosidade += 10;
    }

    public void diminuirLuminosidade(){
        this.luminosidade -= 10;
    }
    
    public int getLuminosidade() {
        return luminosidade;
    }
}
