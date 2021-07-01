public class Estacionamento {
    private Carro[] vagas;
    private int primeiro;
    private int ultimo;
    private int capacidade;
    private int quantidade;

    public Estacionamento() {
        this(10);
    }

    public Estacionamento(int capacidade) {
        this.vagas = new Carro[capacidade];
        this.capacidade = capacidade;
        this.primeiro = 0;
        this.ultimo = 0;
        this.quantidade = 0;
    }

    public boolean estaCheia() {
        return this.capacidade == this.quantidade;
    }

    public boolean estaVazia() {
        return this.quantidade == 0;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    private int proxima(int posicao) {
        return (posicao + 1) % this.capacidade;
    }

    public boolean verificaExistencia(int placa) {
        int i = this.primeiro;
        do {
            if (placa == this.vagas[i].getPlaca()) {
                return true;
            }
            i = proxima(i);
        } while (i != this.ultimo);
        return false;
    }

    public String estacionar(int placa) {
        String s = "O carro com a placa '" + placa + "' ";

        if (this.estaCheia()) {
            s += "nao pode ser estacionado, Estacionamento CHEIO!";
            return s;
        } else if (!this.estaVazia()) {
            if (this.verificaExistencia(placa)) {
                s += "ja esta no estacionamento!";
                return s;
            }
        }
        this.vagas[this.ultimo] = new Carro(placa);
        s += "foi estacionado com sucesso!";
        this.ultimo = proxima(this.ultimo);
        this.quantidade++;
        return s;
    }

    public String retirar(int placa) {
        String saida = "O carro ";
        if (!verificaExistencia(placa)) {
            saida += "Nao foi encontrado!";
            return saida;

        } else if (placa == this.vagas[this.primeiro].getPlaca()) {
            saida += "de placa '" + placa + "' deu " + this.vagas[this.primeiro].getManobras()
                    + " manobras em volta do quarteirao para que outros carros saissem e agora saiu do estacionamento!";

        } else {
            do {
                this.vagas[this.ultimo] = this.vagas[this.primeiro];
                this.vagas[this.ultimo].darVolta();
                this.ultimo = proxima(this.ultimo);
                this.primeiro = proxima(this.primeiro);
            } while (placa != this.vagas[this.primeiro].getPlaca());

            saida += "de placa '" + placa + "' deu " + this.vagas[this.primeiro].getManobras()
                    + " manobras em volta do quarteirao para que outros carros saissem e agora saiu do estacionamento!";
        }
        this.primeiro = proxima(this.primeiro);
        this.quantidade--;
        return saida;
    }

    @Override
    public String toString() {
        String estacionamento = "";
        if (this.estaVazia()) {
            estacionamento = "O estacionamento esta Vazio!";
            return estacionamento;
        } else {
            estacionamento = "S | ";
            int i = this.primeiro;
            do {
                estacionamento += this.vagas[i].getPlaca() + " | ";
                i = proxima(i);
            } while (i != this.ultimo);
            for (i = this.capacidade; i > this.quantidade; i--) {
                estacionamento += "- | ";
            }
            estacionamento += "E";
            return estacionamento;
        }
    }
}