public class PilhaVetorG1<T> { // <> operador diamante
    private T[] dados;
    private int topo;
    private int capacidade;

    public PilhaVetorG1() {
        this(10);
    }

    public PilhaVetorG1(int capacidade) {
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

}