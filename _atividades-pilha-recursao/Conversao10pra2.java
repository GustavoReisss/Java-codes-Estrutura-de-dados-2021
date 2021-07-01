public class Conversao10pra2 {
    private int n10;
    private int n2[];
    private int topo;
    private int resto;

    public Conversao10pra2(int n) {
        this.n10 = n;
        this.n2 = new int[32]; // limite de bits para um inteiro
        this.topo = 0;
    }

    public void push(int resto) {
        this.n2[this.topo] = resto;
    }

    public void n10ParaN2() {
        for (; n10 > 0; this.topo++) {
            this.resto = n10 % 2;
            n10 = n10 / 2;
            push(resto);
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        int i = this.topo - 1;
        for (; i >= 0; i--) {
            resultado = resultado + this.n2[i] + "";
        }
        return resultado;
    }
}
