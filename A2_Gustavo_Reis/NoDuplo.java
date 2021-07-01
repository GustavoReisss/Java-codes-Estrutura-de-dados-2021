public class NoDuplo {
    int info;
    NoDuplo proximo;
    NoDuplo anterior;

    public NoDuplo(int info) {
        this.setInfo(info);
        this.setAnterior(null);
        this.setProximo(null);
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }

    public int getInfo() {
        return this.info;
    }

    public NoDuplo getProximo() {
        return this.proximo;
    }

    public NoDuplo getAnterior() {
        return this.anterior;
    }

    @Override
    public String toString() {
        String noDuplo = " [ " + this.info + " ] ";
        return noDuplo;
    }
}
