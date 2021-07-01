package atividades;

import java.util.Scanner;

public class a1 {
    public static void main(String args[]){
        double cel, fahren;
        Scanner scan = new Scanner (System.in);

        System.out.print("Digite uma temperatura em celsius: ");
        cel = scan.nextDouble();
        scan.close();
        fahren = (cel * 1.8) + 32;
        System.out.printf("\n%.1f° Celsius equivale a %.1f° em fahrenheit", cel, fahren);
    }
}