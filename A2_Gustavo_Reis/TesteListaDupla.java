package A2_Gustavo_Reis;

public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        System.out.println("\nRemovendo alternando entre Inicio-Fim\n");

        lista.adicionaFim(3);
        lista.adicionaInicio(2);
        lista.adicionaFim(4);
        lista.adicionaInicio(1);
        lista.adicionaFim(5);

        System.out.println(lista);

        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);
        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);
        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);

        System.out.println("\nRemovendo alternando entre Fim-Inicio\n");

        lista.adicionaInicio(3);
        lista.adicionaFim(4);
        lista.adicionaInicio(2);
        lista.adicionaFim(5);
        lista.adicionaInicio(1);

        System.out.println(lista);

        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);
        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);
        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);

        System.out.println("\nRemovendo apenas pelo fim\n");

        lista.adicionaFim(1);
        lista.adicionaFim(2);
        lista.adicionaFim(3);
        lista.adicionaFim(4);
        lista.adicionaFim(5);

        System.out.println(lista);

        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);
        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);
        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);
        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);
        System.out.println("Removendo Fim: " + lista.removeFim());
        System.out.println(lista);

        System.out.println("\nRemovendo apenas pelo inicio\n");

        lista.adicionaInicio(1);
        lista.adicionaInicio(2);
        lista.adicionaInicio(3);
        lista.adicionaInicio(4);
        lista.adicionaInicio(5);

        System.out.println(lista);

        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
        System.out.println("Removendo Inicio: " + lista.removeInicio());
        System.out.println(lista);
    }
}
