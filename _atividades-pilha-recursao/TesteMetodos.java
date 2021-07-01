import java.util.Random;
import java.util.Scanner;

public class TesteMetodos {
    public static void main(String[] args) {
        Pilha<Integer> pilhaForte = new Pilha<>();
        Pilha<Cartas> pilhaCartas = new Pilha<>();

        int i, sel, op;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\n[MENU]");
            System.out.println("[1] Pilha Forte");
            System.out.println("[2] Pilha de Cartas");
            System.out.println("[0] Sair");
            System.out.print("Escolha: ");
            do {
                op = scan.nextInt();
                if (op < 0 || op > 2) {
                    System.out.println("Opcao nao encontrada, digite novamente!");
                }
            } while (op < 0 || op > 2);

            if (op == 1) {
                do {
                    System.out.println("\n[MENU - Pilha Forte]");
                    System.out.println("[1] Mostrar pilha");
                    System.out.println("[2] Empilhar Fortemente");
                    System.out.println("[0] Voltar");
                    System.out.print("Escolha: ");
                    do {
                        sel = scan.nextInt();
                        if (sel < 0 || sel > 2) {
                            System.out.println("Opcao nao encontrada, digite novamente!");
                        }
                    } while (sel < 0 || sel > 2);

                    if (sel == 1) {
                        System.out.println("\n" + pilhaForte);
                    } else if (sel == 2) {
                        System.out.print("\nDigite um numero para empilhar: ");
                        i = scan.nextInt();
                        System.out.println(pilhaForte.empilhaForte(i) + "\n");
                    } else {
                        System.out.println("Voltou com sucesso");
                    }
                } while (sel != 0);

            } else if (op == 2) {
                do {
                    System.out.println("\n[MENU - Pilha de cartas]");
                    System.out.println("[1] Gerar pilha");
                    System.out.println("[2] Mostrar pilha");
                    System.out.println("[3] Desempilhar");
                    System.out.println("[0] Voltar");
                    System.out.print("Escolha: ");
                    do {
                        sel = scan.nextInt();
                        if (sel < 0 || sel > 3) {
                            System.out.println("Opcao nao encontrada, digite novamente!");
                        }
                    } while (sel < 0 || sel > 3);

                    if (sel == 1) {
                        if (pilhaCartas.getTopo() == 0) {
                            int j;
                            String[] naipes = { "Paus", "Ouros", "Copas", "Espadas" };
                            String[] valores = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama",
                                    "Rei" };

                            for (j = 0; j < pilhaCartas.getCapacidade(); j++) {
                                int naipe = new Random().nextInt(naipes.length);
                                int valor = new Random().nextInt(valores.length);
                                pilhaCartas.push(new Cartas(naipes[naipe], valores[valor]));
                            }
                            System.out.println("\nPilha Gerada!");
                        } else {
                            System.out.println("\nVoce ainda tem cartas na pilha, retire todas e tente novamente!");
                        }
                    } else if (sel == 2) {
                        System.out.println("\n" + pilhaCartas);
                    } else if (sel == 3) {
                        if (pilhaCartas.getTopo() > 0) {
                            System.out.println("\nA carta " + pilhaCartas.desempilhaDeBaixo() + " foi DESEMPILHADA");
                        } else {
                            System.out.println("\nPilha Vazia, faca um geracao para sua pilha e tente novamente!");
                        }
                    } else {
                        System.out.println("Voltou com sucesso");
                    }
                } while (sel != 0);

            } else {
                System.out.println("Saiu com sucesso");
            }
        } while (op != 0);
        scan.close();
    }
}