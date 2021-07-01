package atividades;

import java.util.Scanner;
   
public class maior {
   
    public static int maiornum(int n1, int n2){
        if(n1>n2){
            return(n1);
        }
        else{
            return(n2);
        }
    }
   
    public static void main(String args[]){
        int n1, n2, maior;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        n1 = scan.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = scan.nextInt();
        scan.close();
        maior = maiornum(n1, n2);
        System.out.printf("O maior numero foi %d", maior);
    }
}
