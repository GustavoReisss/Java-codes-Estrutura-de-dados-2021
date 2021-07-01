public class TesteLista {
    public static void main(String[] args) {
        ListaLigadaComUltimo l1 = new ListaLigadaComUltimo();
        System.out.println(l1);
        l1.insereInicio(10);
        l1.insereInicio(20);
        l1.insereInicio(30);
        System.out.println(l1);

        if (!l1.listaVazia()) {
            System.out.println(l1.removeInicio() + " foi removido do inicio");
            System.out.println(l1);
        }
        l1.insereFim(100);
        l1.insereFim(200);
        l1.insereFim(300);
        System.out.println(l1);

        if (!l1.listaVazia()) {
            System.out.println(l1.removeFim() + " foi removido do fim");
            System.out.println(l1);
        }
    }
}
