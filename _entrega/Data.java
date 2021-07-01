package _entrega;

public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int Ano) {
        this.ano = Ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    void DiaAnterior() {
        int DiaAnt = getDia();
        int MesAnt = getMes();
        int AnoAnt = getAno();

        if (DiaAnt == 1) {
            DiaAnt = 30;
            if (MesAnt == 1) {
                MesAnt = 12;
                AnoAnt--;
            } else {
                MesAnt--;
            }
        } else {
            DiaAnt--;
        }

        toString(DiaAnt, MesAnt, AnoAnt);
    }

    void DiaSeguinte() {
        int DiaSeg = getDia();
        int MesSeg = getMes();
        int AnoSeg = getAno();

        if (DiaSeg == 30) {
            DiaSeg = 1;
            if (MesSeg == 12) {
                MesSeg = 1;
                AnoSeg++;
            } else {
                MesSeg++;
            }
        } else {
            DiaSeg++;
        }

        toString(DiaSeg, MesSeg, AnoSeg);
    }

    void DiaAtual() {
        toString(getDia(), getMes(), getAno());
    }

    void toString(int dia, int mes, int ano) {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
