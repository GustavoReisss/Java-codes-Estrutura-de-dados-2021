public class Pilha<G> {
    private G[] dados;
    private int topo = 0;
    private int capacidade;

    public Pilha() {
        this(10);
    }

    public Pilha(int tam) {
        this.dados = (G[]) new Object[tam];
        this.capacidade = tam;
    }

    public void push(G i) {
        this.dados[this.topo++] = i;
    }

    public G pull() {
        return this.dados[--this.topo];
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public int getTopo() {
        return this.topo;
    }

    public String empilhaForte(G i) {
        int num = (int) i;
        String empilha = "\nO valor " + num;

        if (this.topo == 0) {
            this.dados[this.topo++] = i;
            empilha = empilha + " Foi empilhado";
            return empilha;
        } else {
            int valorTopo = (int) this.dados[this.topo - 1];
            if (valorTopo >= num) {
                this.dados[this.topo++] = i;
                empilha = empilha + " Foi empilhado";
                return empilha;
            } else {
                empilha = empilha + " nao pode ser empilhado!";
                return empilha;
            }
        }
    }

    public G desempilhaDeBaixo() {
        G desempilhada;
        if (this.topo > 1) {
            G aux = this.dados[this.topo - 1];
            desempilhada = this.dados[this.topo - 2];
            this.dados[this.topo - 2] = aux;
            this.topo--;
            return desempilhada;
        } else {
            return this.pull();
        }
    }

    @Override
    public String toString() {
        String pilha = "Pilha: ";
        if (this.topo == 0) {
            pilha += "esta vazia";
        } else {
            for (int i = this.topo - 1; i >= 0; i--) {
                pilha += "\n" + this.dados[i] + " ";
            }
        }
        pilha += "\n";

        return pilha;
    }
}