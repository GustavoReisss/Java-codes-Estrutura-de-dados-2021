public class ListaLigadaComUltimo {
    private No primeiro;
    private No ultimo;

    public ListaLigadaComUltimo() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public No getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(No no) {
        this.primeiro = no;
    }

    public No getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(No no) {
        this.ultimo = no;
    }

    public boolean listaVazia() {
        return this.primeiro == null;
    }

    public void insereInicio(int info) {
        No novo = new No(info);
        if (!listaVazia()) {
            novo.setProximo(this.primeiro);
        } else {
            setUltimo(novo);
        }
        this.setPrimeiro(novo);
    }

    /*
     * public void insereFim(int info) { No novo = new No(info); if
     * (this.listaVazia()) { this.primeiro = novo; } else { No aux = this.primeiro;
     * while (aux.getProximo() != null) { aux = aux.getProximo(); }
     * aux.setProximo(novo); } }
     */

    public void insereFim(int info) {
        No novo = new No(info);
        if (this.listaVazia()) {
            this.setPrimeiro(novo);
        } else {
            this.ultimo.setProximo(novo);
        }
        this.setUltimo(novo);

    }

    public int removeInicio() {
        int intAux = this.primeiro.getInfo();
        setPrimeiro(primeiro.getProximo());
        // this.primeiro = this.primeiro.getProximo(); // faz a mesma função que o
        // comando de cima.
        if (listaVazia()) {
            this.setUltimo(null);
        }
        return intAux;
    }

    public int removeFim() {
        int intAux = this.ultimo.getInfo();
        if (this.primeiro == this.ultimo) {
            this.setPrimeiro(null);
            this.setUltimo(null);
        } else {
            No aux = this.primeiro;
            while (aux.getProximo() != this.ultimo) {
                aux = aux.getProximo();
            }
            aux.setProximo(null);
            this.setUltimo(aux);
        }
        return intAux;
    }

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
