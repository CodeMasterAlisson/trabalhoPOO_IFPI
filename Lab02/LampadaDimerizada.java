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
        if(getLuminosidade() != 0){
            luminosidade+=10;
            System.out.println("Luminosidade aumentada em " + luminosidade + "%");
        } else {
            System.out.println("Lâmpada não está ligada");
        }
    }

    public void diminuirLuminosidade(){
        if(getLuminosidade() != 0){
            luminosidade-=10;
            System.out.println("Luminosidade diminuída em " + luminosidade + "%");
        } else {
            System.out.println("Lâmpada não está ligada");
        }
    }
    public int getLuminosidade() {
        return luminosidade;
    }
}
