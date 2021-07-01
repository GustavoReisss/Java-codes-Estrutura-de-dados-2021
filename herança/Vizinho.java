import java.util.Queue;

public class Vizinho {

    public static void main(String[] args) {
        // Animal a = new Animal();
        // -> Não se pode instanciar interfaces

        Cachorro toto = new Cachorro();

        toto.fazBarulho();

        Gato bichano = new Gato();

        bichano.fazBarulho();

        // Tartaruga leonardo = new Tartaruga();
        // -> Não se pode instanciar uma classe abstrata
    }
}
