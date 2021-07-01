public class TestePilhaGenerica {
    public static void main(String[] args) {
        PilhaVetorG<Carta> pilhaCartas = new PilhaVetorG<>();

        PilhaVetorG<Integer> pilhaInteiros = new PilhaVetorG<>();

        Carta c1 = new Carta("copas", "valete");

        pilhaCartas.push(c1);

        pilhaCartas.push(new Carta("espadas", "As"));

        pilhaInteiros.push(23); // autoboxing
        pilhaInteiros.push(45);

        System.out.println(pilhaCartas);
        System.out.println(pilhaInteiros);
    }
}
