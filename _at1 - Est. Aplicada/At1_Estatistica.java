import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class At1_Estatistica {

    public static void gerarAmostras(double amostras[]) {
        Random ram = new Random();

        for (int i = 0; i < amostras.length; i++) {
            amostras[i] = (ram.nextInt(109) + 30) / 10.0;
        }
    }

    public static void mostrarAmostras(double amostras[]) {
        System.out.println("\n\tAmostras:\n");
        int linha = amostras.length / 8;
        for (int i = 0; i < linha; i++) {
            System.out.print("\t" + amostras[i] + "   ");
            for (int j = 1; j < 8; j++) {
                System.out.print(amostras[j * linha + i] + "   ");
            }
            System.out.println("");
        }
    }

    public static void quickSort(double v[], int p, int r) {
        if (p < r) {
            int q = partition(v, p, r);
            quickSort(v, p, q - 1);
            quickSort(v, q + 1, r);
        }
    }

    public static int partition(double v[], int p, int r) {
        int i, j;
        double aux;
        double x = v[r];
        i = p - 1;
        for (j = p; j < r; j++) {
            if (v[j] < x) {
                i = i + 1;
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }
        i = i + 1;
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        return i;
    }

    public static void gerarClasses(double amostras[], Classes classe[]) {
        for (int i = 0; i < classe.length; i++) {
            classe[i] = new Classes(i + 3, amostras.length);
        }
    }

    public static void gerarFreqAbsoluta(double amostras[], Classes classe[]) {
        int freqAbsoluta; // fi
        int ultimo = 0;
        int sair;
        for (int i = 3; i <= 13; i++) {
            freqAbsoluta = 0;
            sair = 0;
            do {
                if (ultimo < 120) {
                    if (amostras[ultimo] < ((double) (i + 1))) {
                        freqAbsoluta++;
                        ultimo++;
                    } else {
                        sair = 1;
                    }
                } else {
                    sair = 1;
                }
            } while (sair == 0);
            classe[i - 3].setFreqAbsoluta(freqAbsoluta);
        }
    }

    public static void gerarFreqRelativaEPercentual(Classes classe[]) {
        double freqAbsoluta; // fi
        double qtdAmostras = classe[0].getQtdAmostras();
        for (int i = 0; i < classe.length; i++) {
            freqAbsoluta = classe[i].getFreqAbsoluta();
            classe[i].setFreqRelativaEPercentual(freqAbsoluta / qtdAmostras);
        }
    }

    public static void gerarFreqAcumulada(Classes classe[]) {
        int freqAcumuladaAnterior;
        int freqAcumuladaAtual = classe[0].getFreqAbsoluta();
        classe[0].setFreqAcumulada(freqAcumuladaAtual);
        for (int i = 1; i < classe.length; i++) {
            freqAcumuladaAnterior = classe[i - 1].getfreqAcumulada();
            freqAcumuladaAtual = classe[i].getFreqAbsoluta();
            classe[i].setFreqAcumulada(freqAcumuladaAnterior + freqAcumuladaAtual);
        }
    }

    public static void calcularMA(int amostras[]) {
        int qtdAmostras = amostras.length;
        double total = 0;
        double totalQuadrado = 0;
        double ma;
        double variancia;
        double desvioPadrao;
        double coeficienteVariacao;

        for (int i = 0; i < qtdAmostras; i++) {
            total += amostras[i];
            totalQuadrado += amostras[i] * amostras[i];
        }

        ma = total / qtdAmostras;
        variancia = (totalQuadrado / qtdAmostras) - (ma * ma);
        desvioPadrao = Math.sqrt(variancia);
        coeficienteVariacao = (desvioPadrao / ma) * 100;

        System.out.printf("\nMedia Artitmetica:\n%.1f / %d == %.4f", total, qtdAmostras, ma);
        System.out.printf("\n\nVariancia:\n(%.4f / %d) - (%.1f / %d)^2  ==  %.4f", totalQuadrado, qtdAmostras, total,
                qtdAmostras, variancia);
        System.out.printf("\n\nDesvio Padrao:\nRaiz Quadrada(%.4f) == %.4f", variancia, desvioPadrao);
        System.out.printf("\n\nCoeficiente de Variacao:\n(%.4f / %.4f) * 100 == %.2f%%", desvioPadrao, ma,
                coeficienteVariacao);
    }

    public static void mostrarFrequencias(Classes classe[]) {
        System.out.println("\n\t\tTabela de Frequencias\n");
        for (int j = 0; j < classe.length; j++) {
            int classeAtual = classe[j].getClasse();
            int i = j + 1;
            int fi = classe[j].getFreqAbsoluta();
            double fri = classe[j].getFreqRelativa();
            int Fi = classe[j].getfreqAcumulada();
            double Xi = (classeAtual * 2 + 1) / 2.0;
            double Pi = classe[j].getFreqPercentual();

            System.out.print("i: " + i + " || ");
            System.out.print("Classe: " + classeAtual + "|-" + (classeAtual + 1) + " || ");
            System.out.print("fi: " + fi + " || ");
            System.out.printf("fri: %.4f || ", fri);
            System.out.print("Fi: " + Fi + " || ");
            System.out.printf("Xi: %.1f || ", Xi);
            System.out.printf("Pi: %.2f%%\n", Pi);
            System.out
                    .println("---------------------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        int qtd = 50;
        int amostras[] = new int[qtd];
        Classes classe[] = new Classes[11];
        Scanner scan = new Scanner(System.in);
        // gerarAmostras(amostras);
        for (int i = 0; i < qtd; i++) {
            System.out.print((i + 1) + ": ");
            amostras[i] = scan.nextInt();
        }
        scan.close();
        // quickSort(amostras, 0, qtd - 1);
        // gerarClasses(amostras, classe);
        // gerarFreqAbsoluta(amostras, classe);
        // gerarFreqRelativaEPercentual(classe);
        // gerarFreqAcumulada(classe);
        // mostrarAmostras(amostras);
        // mostrarFrequencias(classe);
        calcularMA(amostras);
    }
}
