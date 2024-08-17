package Lab02;

public class AppLampadaDimerizada {

    public static void main(String[] args) {

        LampadaDimerizada lampada = new LampadaDimerizada();

        System.out.printf("\nEstado inicial lampada dimerizada: %d \n", lampada.getLuminosidade());

        lampada.acender();
        System.out.printf("\nLampada em: %d %%\n", lampada.getLuminosidade());

        lampada.aumentarLuminosidade();
        System.out.printf("\nLampada em: %d %%\n", lampada.getLuminosidade());

        lampada.diminuirLuminosidade();
        System.out.printf("\nLampada em: %d %%\n", lampada.getLuminosidade());

        lampada.aumentarLuminosidade();
        System.out.printf("\nEstado final: %d %%\n", lampada.getLuminosidade());
    }
}
