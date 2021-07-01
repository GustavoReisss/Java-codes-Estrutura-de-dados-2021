public class Carro {
    private int placa;
    private int manobras;

    public Carro(int placa) {
        this.placa = placa;
        this.manobras = 0;
    }

    public int getPlaca() {
        return this.placa;
    }

    public int getManobras() {
        return this.manobras;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void setManobras(int manobras) {
        this.manobras = manobras;
    }

    public void darVolta() {
        this.manobras++;
    }
}
