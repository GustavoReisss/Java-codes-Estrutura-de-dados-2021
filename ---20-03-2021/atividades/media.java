package atividades;

import java.util.Scanner;

public class media {
    public static void main(String args[]){
        int qtd;
        double v[], media = 0;
        Scanner scan = new Scanner (System.in);

        System.out.print("Digite a quantidade de notas: ");
        qtd = scan.nextInt();
        v = new double[qtd];

        for(int i=0;i<v.length;i++){
            System.out.printf("Nota %d: ", i+1);
            v[i] = scan.nextDouble();
            media += v[i];
        }
        scan.close();
        media /= v.length;
        System.out.printf("\nA media das notas digitadas eh %.1f", media);
        
    }
}
