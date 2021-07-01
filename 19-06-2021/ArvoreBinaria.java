public class ArvoreBinaria {
    NoBinario raiz;

    public NoBinario getRaiz() {
        return raiz;
    }

    public void setRaiz(NoBinario raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return this.raiz == null;
    }

    public void insere(int i) {
        NoBinario novo = new NoBinario(i);
        if (this.estaVazia()) {
            setRaiz(novo);
        } else {
            insereRecursivo(novo, raiz);
        }
    }

    private void insereRecursivo(NoBinario novo, NoBinario atual) {
        if (novo.getInfo() > atual.getInfo()) { // ir para direita
            if (atual.getDir() == null) {
                atual.setDir(novo);
            } else { // fazer a busca para direita
                insereRecursivo(novo, atual.getDir());
            }
        } else { // ir para esquerda
            if (atual.getEsq() == null) {
                atual.setEsq(novo);
            } else {
                insereRecursivo(novo, atual.getEsq());
            }
        }
    }

    @Override
    public String toString() {
        String s = "arvore: ";
        // percurso em ordem na árvore
        if (estaVazia()) {
            s += "vazia";
        } else {
            s += toStringRec(raiz);
        }
        return s;
    }

    private String toStringRec(NoBinario atual) {
        String s = "";
        if (atual != null) {
            s += "[ " + toStringRec(atual.getEsq()) + " ]";
            s += atual;
            s += "[ " + toStringRec(atual.getDir()) + " ]";
        } else {
            s += "//";
        }
        return s;
    }

    public int numNos() {
        return estaVazia() ? 0 : numNosRec(raiz);
    }

    private int numNosRec(NoBinario atual) {
        return atual != null ? 1 + numNosRec(atual.getEsq()) + numNosRec(atual.getDir()) : 0;
    }
}
