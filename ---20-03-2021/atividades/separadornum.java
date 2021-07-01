package atividades;

import java.util.Scanner;

public class separadornum{
    public static void main(String args[]){
        int soma = 0;
        int num;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Digite um inteiro maior do que zero para saber a soma de seus digitos: ");
            num = scan.nextInt();
        }while(num < 1);
        scan.close();
        
        while(num > 0){
            soma += num % 10;
            num = num /10;
        }
        System.out.println("A soma dos digitos do numero informado eh igual a "+ soma);
    }
}