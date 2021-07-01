public class PilhaVetorG<T> { // <> operador diamante
    private T[] dados;
    private int capacidade;
    private int topo;

    public PilhaVetorG() {
        this(10);
    }

    public PilhaVetorG(int capacidade) {
        this.dados = (T[]) new Object[capacidade];
        this.topo = 0;
        this.capacidade = capacidade;
    }

    public boolean estaCheia() {
        return this.topo == this.capacidade;
    }

    public boolean estaVazia() {
        return this.topo == 0;
    }

    public void push(T i) {
        this.dados[this.topo++] = i;
    }

    public T pull() {
        return this.dados[--this.topo];
    }

    public int tamanho() {
        return this.topo;
    }

    public T consultaTopo() {
        return this.dados[topo - 1];
    }

    @Override
    public String toString() {
        String sPilha = "Pilha: ";
        if (this.estaVazia()) {
            sPilha = sPilha + "esta vazia";
        } else {
            sPilha = sPilha + "Capacidade: " + this.capacidade + " Tamanho: " + this.tamanho() + "\n";
            for (int i = this.topo - 1; i >= 0; i--) {
                sPilha = sPilha + this.dados[i] + " ";
            }
        }
        sPilha = sPilha + "\n";
        return sPilha;
    }
}
