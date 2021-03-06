public class Fila {
    private int[] dados;
    private int primeiro;
    private int ultimo;
    private int quantidade;
    private int capacidade;

    public Fila() {
        this(6);
    }

    public Fila(int capacidade) {
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
        this.primeiro = 0;
        this.ultimo = 0;
        this.quantidade = 0;
    }

    public boolean estaVazia() {
        return this.quantidade == 0;
    }

    public boolean estaCheia() {
        return this.quantidade == this.capacidade;
    }

    private int proxima(int posicao) {
        return (posicao + 1) % this.capacidade;
    }

    private int anterior(int posicao) {
        return (posicao + this.capacidade - 1) % this.capacidade;
    }

    public void insere(int dado) {
        if (!this.estaCheia()) {
            this.dados[this.ultimo] = dado;
            this.ultimo = proxima(this.ultimo);
            this.quantidade++;
        }
    }

    public int remove() {
        this.primeiro = proxima(this.primeiro);
        this.quantidade--;
        return this.dados[anterior(this.primeiro)];
    }

    public int primeiro() {
        return this.dados[this.primeiro];
    }

    public int ultimo() {
        return this.dados[anterior(this.ultimo)];
    }

    public int tamanho() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        String s = "Fila: ";
        if (this.estaVazia()) {
            s += "vazia";
        } else {
            int i = this.primeiro;
            do {
                s += this.dados[i] + " ";
                i = proxima(i);
            } while (i != this.ultimo);
        }
        return s;
    }

    public String stringVetor() {
        int i;
        String s = "";
        if (this.estaVazia()) {
            for (i = 0; i < this.capacidade; i++) {
                s = s + "_ ";
            }
        } else if (this.estaCheia()) {
            for (i = 0; i < this.capacidade; i++) {
                s = s + this.dados[i] + "";
            }
        } else if (this.primeiro < this.ultimo) {
            for (i = 0; i < this.primeiro; i++) {
                s = s + "_ ";
            }
            for (i = this.primeiro; i < this.ultimo; i++) {
                s = s + this.dados[i] + " ";
            }
            for (i = this.ultimo; i < this.capacidade; i++) {
                s = s + "_ ";
            }
        } else {
            for (i = 0; i < this.ultimo; i++) {
                s = s + this.dados[i] + " ";
            }
            for (i = this.ultimo; i < this.primeiro; i++) {
                s = s + "_ ";
            }
            for (i = this.primeiro; i < this.capacidade; i++) {
                s = s + this.dados[i] + " ";
            }
        }
        return s;
    }
}