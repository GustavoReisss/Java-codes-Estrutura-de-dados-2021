public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;

    public ListaDupla() {
        this.setPrimeiro(null);
        this.setUltimo(null);
    }

    public void setPrimeiro(NoDuplo primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(NoDuplo ultimo) {
        this.ultimo = ultimo;
    }

    public NoDuplo getPrimeiro() {
        return this.primeiro;
    }

    public NoDuplo getUltimo() {
        return this.ultimo;
    }

    public boolean testeVazia() {
        return this.primeiro == null;
    }

    public void adicionaFim(int info) {
        NoDuplo novoNoDuplo = new NoDuplo(info);
        if (this.testeVazia()) {
            this.setPrimeiro(novoNoDuplo);
        } else {
            this.ultimo.setProximo(novoNoDuplo);
            novoNoDuplo.setAnterior(this.ultimo);
        }
        this.setUltimo(novoNoDuplo);
    }

    public int removeFim() {
        int exUltimo = this.ultimo.getInfo();
        this.setUltimo(ultimo.getAnterior());
        if (this.ultimo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.ultimo.setProximo(null);
        }
        return exUltimo;
    }

    public void adicionaInicio(int info) {
        NoDuplo novoNoDuplo = new NoDuplo(info);
        if (this.testeVazia()) {
            this.setUltimo(novoNoDuplo);
        } else {
            this.primeiro.setAnterior(novoNoDuplo);
            novoNoDuplo.setProximo(primeiro);
        }
        this.setPrimeiro(novoNoDuplo);
    }

    public int removeInicio() {
        int exPrimeiro = this.primeiro.getInfo();
        this.setPrimeiro(primeiro.getProximo());
        if (this.primeiro == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.primeiro.setAnterior(null);
        }
        return exPrimeiro;
    }

    @Override
    public String toString() {
        String listaDupla = "// ->";
        if (testeVazia()) {
            listaDupla = "A lista esta vazia";
        } else {
            NoDuplo noAux = this.primeiro;
            do {
                listaDupla += noAux + "->";
                noAux = noAux.proximo;
            } while (noAux != null);
            listaDupla += " //";
        }
        return listaDupla;
    }
}
