public class Classes {
    private int classe;
    private int qtdAmostras;
    private int freqAbsoluta; // fi
    private double freqRelativa; // fri
    private int freqAcumulada; // Fi
    private double freqPercentual; // Pi %

    public Classes(int classe, int qtdAmostras) {
        this.setClasse(classe);
        this.setQtdAmostras(qtdAmostras);
    }

    public int getClasse() {
        return this.classe;
    }

    public int getQtdAmostras() {
        return this.qtdAmostras;
    }

    public int getFreqAbsoluta() {
        return this.freqAbsoluta;
    }

    public double getFreqRelativa() {
        return this.freqRelativa;
    }

    public int getfreqAcumulada() {
        return this.freqAcumulada;
    }

    public double getFreqPercentual() {
        return this.freqPercentual;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public void setQtdAmostras(int qtdAmostras) {
        this.qtdAmostras = qtdAmostras;
    }

    public void setFreqAbsoluta(int freqAbsoluta) {
        this.freqAbsoluta = freqAbsoluta;
    }

    public void setFreqRelativaEPercentual(double freqRelativa) {
        this.freqRelativa = freqRelativa;
        this.freqPercentual = freqRelativa * 100;
    }

    public void setFreqAcumulada(int freqAcumulada) {
        this.freqAcumulada = freqAcumulada;
    }
}
