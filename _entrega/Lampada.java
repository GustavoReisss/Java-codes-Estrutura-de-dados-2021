import java.util.Random;

public class Lampada {
    String tipo;
    int tensao;
    int potencia;
    boolean status;

    // Construtores //

    // Passando o status da lampada
    public Lampada(String tipo, int tensao, int potencia, Boolean status) {
        this.setTipo(tipo);
        this.setTensao(tensao);
        this.setPotencia(potencia);
        this.setStatus(status);
    }

    // Lampada com status random
    public Lampada(String tipo, int tensao, int potencia) {
        Random ram = new Random();
        boolean status = ram.nextBoolean();
        this.setTipo(tipo);
        this.setTensao(tensao);
        this.setPotencia(potencia);
        this.setStatus(status);
    }

    // Setters

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    // Getters

    public String getTipo() {
        return tipo;
    }

    public int getTensao() {
        return tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public Boolean getStatus() {
        return status;
    }

    // Métodos

    void acender() {
        boolean statusLamp = this.getStatus();

        if (statusLamp == true) {
            System.out.printf("\nA lampada ja esta acessa!\n");
        } else {
            this.setStatus(true);
            System.out.printf("\nA lampada foi ACESSA\n");
        }
    }

    void apagar() {
        boolean statusLamp = this.getStatus();

        if (statusLamp == false) {
            System.out.printf("\nA lampada ja esta apagada!\n");
        } else {
            this.setStatus(false);
            System.out.printf("\nA lampada foi APAGADA\n");
        }
    }

    void verificarStatus() {
        boolean statusLamp = this.getStatus();

        if (statusLamp == false) {
            System.out.printf("\nStatus: A lampada esta APAGADA\n");
        } else {
            System.out.printf("\nStatus: A lampada esta ACESSA\n");
        }
    }

    void verLampada() {
        System.out.printf("------------------------\n");
        System.out.printf("lampada 1: \n\nTipo: %s\nTensao: %d\nPotencia: %d ", this.getTipo(), this.getTensao(),
                this.getPotencia());
        this.verificarStatus();
    }
}
