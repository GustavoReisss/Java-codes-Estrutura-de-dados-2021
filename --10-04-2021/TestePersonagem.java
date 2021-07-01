public class TestePersonagem{

    public static void main(String[] args) {
        int i;
        Personagem p1 = new Personagem("junim", 3, 5, 5);
        Personagem p2 = new Personagem("cleitim");
        Personagem p3 = new Personagem();
        //todas as informações p1
        System.out.printf("p1: %s\nFome: %d\nForca: %d\nSono: %d", p1.getNome(), p1.getFome(), p1.getForca(), p1.getSono());
        //apenas o nome p2
        System.out.printf("\n\np2: %s\nFome: %d\nForca: %d\nSono: %d", p2.getNome(), p2.getFome(), p2.getForca(), p2.getSono());
        //sem parametros p3
        System.out.printf("\n\np3: %s\nFome: %d\nForca: %d\nSono: %d", p3.getNome(), p3.getFome(), p3.getForca(), p3.getSono());


        p1.dormir(6);
        System.out.println("novo sono: " + p1.getSono());
        /*p1.setFome(3);
        p1.setSono(2);

        p2.setFome(15);
        p2.setForca(-20);

        System.out.println("Sono de p1: " + p1.getSono());
        System.out.println("Fome de p1: " + p1.getFome());*/
    }
}