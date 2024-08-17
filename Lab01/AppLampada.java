package Lab01;

public class AppLampada {

    public static void main(String[] args) {

        LampadaTresEstados lampada = new LampadaTresEstados();

        System.out.printf("\nEstado inicial: %s \n", lampada.getEstado());
        
        lampada.acender();
        System.out.printf("\nLampada: %s \n", lampada.getEstado());

        lampada.meiaLuz();
        System.out.printf("\nLampada: %s \n", lampada.getEstado());

        lampada.apagar();
        System.out.printf("\nEstado final: %s \n", lampada.getEstado());

    }
}
