package Lab01;

public class LampadaTresEstados {

    private boolean estado;

    public LampadaTresEstados() {
        apagar();
    }

    public void apagar(){
        estado = false;
    }

    public void acender(){
        estado = true;
    }

    public String meiaLuz(){
        return "meia-luz";
    }

    public boolean getEstado(){
        return estado;
    }
}
