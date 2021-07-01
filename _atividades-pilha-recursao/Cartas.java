public class Cartas {
    private String naipe;
    private String valor;

    public Cartas(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "|" + valor + "| de " + naipe;
    }
}