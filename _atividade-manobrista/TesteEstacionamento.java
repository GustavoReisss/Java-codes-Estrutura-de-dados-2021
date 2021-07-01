import java.util.Random;
import java.util.Scanner;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Estacionamento seuZe = new Estacionamento();
        int op, placa;
        Scanner scan = new Scanner(System.in);
        Random ram = new Random();
        do {
            do {
                System.out.println("\n[MENU]");
                System.out.println("[1] Gerar Estacionamento (Somente quando VAZIO)");
                System.out.println("[2] Estacionar um carro");
                System.out.println("[3] Retirar um carro");
                System.out.println("[4] Ver estacionamento");
                System.out.println("[0] Sair");
                System.out.print("[ESCOLHA]: ");
                op = scan.nextInt();
            } while (op < 0 || op > 4);
            if (op == 1) {
                if (seuZe.getQuantidade() != 0) {
                    System.out.println("\nO estacionamento não está vazio");
                } else {
                    for (int i = 0; i < seuZe.getCapacidade(); i++) {
                        System.out.println(seuZe.estacionar(ram.nextInt(9999)));
                    }
                    System.out.println("\nEstacionamento Gerado!");
                }
            } else if (op == 2) {
                do {
                    System.out
                            .println("\nDigite os numeros da placa do carro que deseja estacionar[Somente Numeros]! ");
                    System.out.print("[PLACA]: ");
                    placa = scan.nextInt();
                } while (placa <= 0);
                System.out.println("\n" + seuZe.estacionar(placa));
            } else if (op == 3) {
                if (seuZe.estaVazia()) {
                    System.out.println("\nNao ha carros no estacionamento!");
                } else {
                    System.out.println("\nDigite o numero da placa do carro que deseja retirar");
                    System.out.print("[PLACA]: ");
                    placa = scan.nextInt();
                    System.out.println("\n" + seuZe.retirar(placa));
                }
            } else if (op == 4) {
                System.out.println("\n" + seuZe);
            } else {
                System.out.println("Saiu com sucesso!");
            }

        } while (op != 0);
        scan.close();
    }
}
