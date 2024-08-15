package Lab01;

public class LampadaTresEstados {

    private String estado;

    public LampadaTresEstados() {
        apagar();
    }

    public void apagar(){
        this.estado = "lampada apagada";
    }

    public void acender(){
        this.estado = "lampada acesa";
    }

    public void meiaLuz(){
        this.estado = "Lampada em meia luz";
    }

    public String getEstado(){
        return estado;
    }
}
