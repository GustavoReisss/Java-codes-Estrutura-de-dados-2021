public class ArvoresBinarias {
    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria();

        ab.insere(20);
        ab.insere(10);
        ab.insere(30);
        ab.insere(5);
        ab.insere(15);
        ab.insere(25);
        ab.insere(35);
        ab.insere(13);
        ab.insere(27);

        System.out.println(ab);

        System.out.println("numero de nos: " + ab.numNos());
    }
}