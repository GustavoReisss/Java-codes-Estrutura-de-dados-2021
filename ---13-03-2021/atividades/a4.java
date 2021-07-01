//Ler um número inteiro e dizer se ele é par ou ímpar.

package atividades;

import java.util.Scanner;

public class a4 {
    public static void main(String args[]){ 
        int num;
        Scanner scan = new Scanner (System.in);

        System.out.print("Digite um inteiro para saber se o número eh par ou impar: ");
        num = scan.nextInt();
        scan.close();
        if(num % 2 == 0){
            System.out.printf("O numero %d eh par", num);
        }else{
            System.out.printf("O número %d eh impar", num);
        }
    }
}
