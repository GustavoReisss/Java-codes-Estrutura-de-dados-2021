public class ListaLigadaComUltimo extends ListaLigada {
    private No ultimo;

    public ListaLigadaComUltimo() {
        super();
        this.ultimo = null;
    }

    public No getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public void insereInicio(int info) {
        No novo = new No(info);
        if (!listaVazia()) {
            novo.setProximo(getPrimeiro());
        } else {
            setUltimo(novo);
        }
        this.setPrimeiro(novo);
    }

    @Override
    public void insereFim(int info) {
        No novo = new No(info);
        if (this.listaVazia()) {
            this.setPrimeiro(novo);
        } else {
            this.ultimo.setProximo(novo);
        }
        this.setUltimo(novo);

    }

    @Override
    public int removeInicio() {
        int intAux = getPrimeiro().getInfo();
        setPrimeiro(getPrimeiro().getProximo());
        // this.primeiro = this.primeiro.getProximo(); // faz a mesma função que o
        // comando de cima.
        if (listaVazia()) {
            this.setUltimo(null);
        }
        return intAux;
    }

    public int removeFim() {
        int intAux = this.ultimo.getInfo();
        if (getPrimeiro() == this.ultimo) { // lista tem um elemento só
            this.setPrimeiro(null);
            this.setUltimo(null);
        } else {
            No aux = getPrimeiro();
            while (aux.getProximo() != this.ultimo) { // delegando a tarefa de saber quem é o proximo para o nó
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
            No aux = getPrimeiro();
            while (aux != null) {
                s += aux + " -> ";
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s;
    }
}
