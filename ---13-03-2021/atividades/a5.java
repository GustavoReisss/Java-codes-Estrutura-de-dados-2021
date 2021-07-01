//Ler um número inteiro e exibir a sua tabuada completa do 0 ao 10.

package atividades;

import java.util.Scanner;

public class a5 {
    public static void main(String args[]){
        int num, i;
        Scanner scan = new Scanner (System.in);

        System.out.print("Digite um inteiro para saber sua tabuada do 0 ao 10: ");
        num = scan.nextInt();
        scan.close();

        for(i=0; i<11;i++){
            System.out.printf("\n%d x %d = %d", num, i, num * i);
        }
    }
}
