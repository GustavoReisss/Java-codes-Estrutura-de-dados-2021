package _entrega;

import java.util.Scanner;

public class TesteLampadas {
    public static void main(String args[]) {
        Lampada[] l = { new Lampada("LED", 110, 470, true), // informando o status
                new Lampada("Incandescente", 220, 300), // ramdom
                new Lampada("Fluorescentes", 220, 355) // ramdom
        };
        int escolha = 1;
        int i = -1;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("[MENU]");
            System.out.println();
            System.out.println("[1] Escolher Lampada");
            System.out.println("[2] Ver Status da Lampada");
            System.out.println("[3] Acender Lampada");
            System.out.println("[4] Apagar Lampada");
            System.out.println("[5] Verificar Status da Lampada");
            System.out.println("[6] Sair");
            System.out.println();
            System.out.print("Escolha: ");

            do {
                if (escolha > 6 || escolha < 1) {
                    System.out.println("Escolha Invalida! Digite novamente!");
                } else {
                    escolha = scan.nextInt();
                }
            } while (escolha > 6 || escolha < 1);

            if (escolha == 1) {
                do {
                    System.out.println("Escolha uma lampada [0 - 2]: ");

                    if (escolha > 2 || escolha < 0) {
                        System.out.printf("Escolha Invalida! Digite novamente!");
                    } else {
                        i = scan.nextInt();
                    }
                } while (escolha > 2 || escolha < 0);

            } else if (escolha == 2) {
                if (i == -1) {
                    System.out.printf("\n\nEscolha uma Lampada antes de continuar\n");
                } else {
                    l[i].verLampada();
                }
            } else if (escolha == 3) {
                if (i == -1) {
                    System.out.printf("\n\nEscolha uma Lampada antes de continuar\n");
                } else {
                    l[i].acender();
                }
            } else if (escolha == 4) {
                if (i == -1) {
                    System.out.printf("\n\nEscolha uma Lampada antes de continuar\n");
                } else {
                    l[i].apagar();
                }
            } else if (escolha == 5) {
                if (i == -1) {
                    System.out.printf("\n\nEscolha uma Lampada antes de continuar\n");
                } else {
                    l[i].verificarStatus();
                }
            } else {
                System.out.println("Saiu com sucesso");
            }

        } while (escolha != 6);

    }
}
