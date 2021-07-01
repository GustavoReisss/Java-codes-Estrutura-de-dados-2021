public class NoBinario {
    private int info;
    private NoBinario esq;
    private NoBinario dir;
    private int ocorrencias;

    public NoBinario(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public NoBinario getEsq() {
        return esq;
    }

    public NoBinario getDir() {
        return dir;
    }

    public int getOcorrencias() {
        return ocorrencias;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setEsq(NoBinario esq) {
        this.esq = esq;
    }

    public void setDir(NoBinario dir) {
        this.dir = dir;
    }

    public void setOcorrencias(int ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
