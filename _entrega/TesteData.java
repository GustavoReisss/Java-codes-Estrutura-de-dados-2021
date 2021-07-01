package _entrega;

import java.util.Scanner;

public class TesteData {
    public static void main(String args[]) {
        int dia = 0, mes = 0, ano = 0;
        Scanner scan = new Scanner(System.in);

        do {
            if (dia == 0) {
                System.out.println("Digite o dia (1-30)");
                dia = scan.nextInt();
            } else {
                System.out.println("Invalido, digite novamente!");
                dia = scan.nextInt();
            }
        } while (dia < 1 || dia > 30);

        do {
            if (mes == 0) {
                System.out.println("Digite o mes (1-12)");
                mes = scan.nextInt();
            } else {
                System.out.println("Invalido, digite novamente!");
                mes = scan.nextInt();
            }
        } while (mes < 1 || mes > 12);

        do {
            if (ano == 0) {
                System.out.println("Digite o ano (1-2021)");
                ano = scan.nextInt();
            } else {
                System.out.println("Invalido, digite novamente!");
                ano = scan.nextInt();
            }
        } while (ano < 1 || ano > 2021);

        Data dat = new Data(dia, mes, ano);

        System.out.print("Dia Anterior: ");
        dat.DiaAnterior();
        System.out.print("Dia Atual: ");
        dat.DiaAtual();
        System.out.print("Dia Seguinte: ");
        dat.DiaSeguinte();
    }
}