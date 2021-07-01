package atividades;

import java.util.Scanner;

public class mediaAeP {

    static void Aritmetica(double notas[]){
        double media = 0;
        for(int i=0;i<notas.length;i++){
            media +=notas[i];
        }
        media /= 3;
        System.out.printf("O resultado da media Aritmetica das notas digitadas foi: %.1f", media);
    }

    static void Ponderada(double notas[]){
        double media = ((notas[0] * 5) + (notas[1] * 3)+ (notas[2] * 2)) / 10;
        System.out.printf("O resultado da media Ponderada das notas digitadas foi: %.1f", media);
        
    }    
    public static void main(String ars[]){
        double notas[] = new double[3];
        char escolha;
        Scanner scan = new Scanner(System.in);
        int saida;
        
        for(int i=0; i<notas.length; i++){
            System.out.printf("Digite a nota %d: ", i+1);
            notas[i] = scan.nextDouble();
        }
        scan.nextLine();
        do{
            System.out.printf("\nDeseja utilizar media Aritmetica ou Ponderada?\nDigite [a] para Aritmetica e [p] para Ponderada: ");
            escolha = scan.nextLine().toLowerCase().charAt(0);

            if(escolha == 'a'){
                Aritmetica(notas);
                saida = 1;
            }
            else if(escolha == 'p'){
                Ponderada(notas);
                saida = 1;
            }else{
                System.out.print("\n[ERRO] O valor digitado n esta nas opcoes\nDigite Novamente!\n");
                saida = 0;
            }
         } while(saida == 0);
        scan.close();
    }
}
