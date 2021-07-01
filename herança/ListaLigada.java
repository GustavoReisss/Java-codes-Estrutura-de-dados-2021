public abstract class ListaLigada {
    private No primeiro;

    public ListaLigada() {
        this.primeiro = null;
    }

    public No getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(No no) {
        this.primeiro = no;
    }

    public boolean listaVazia() {
        return this.primeiro == null;
    }

    public void insereInicio(int info) {
        No novo = new No(info);
        if (!listaVazia()) {
            novo.setProximo(this.primeiro);
        }
        this.setPrimeiro(novo);
    }

    public int removeInicio() {
        int intAux = this.primeiro.getInfo();
        setPrimeiro(primeiro.getProximo());
        // this.primeiro = this.primeiro.getProximo(); // faz a mesma função que o
        // comando de cima.
        return intAux;
    }

    public void insereFim(int info) {
        No novo = new No(info);
        if (this.listaVazia()) {
            this.primeiro = novo;
        } else {
            No aux = this.primeiro;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public abstract int removeFim();

    @Override
    public String toString() {
        String s = "lista: ";
        if (listaVazia()) {
            s += "vazia";
        } else {
            No aux = this.primeiro;
            while (aux != null) {
                s += aux + " -> ";
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s;
    }
}
