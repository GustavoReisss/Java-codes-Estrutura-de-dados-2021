/*Ler as coordenadas (x, y) de dois pontos P1 e P2, calcular a distância entre eles e exibir o resultado. A distância é dada por  . Pesquise na classe Math do Java para o uso da raiz quadrada. */

package atividades;

import java.util.Scanner;
import java.lang.Math;

public class a3 {
    public static void main(String args[]){
        int x1, y1, x2, y2;
        double distancia;
        Scanner scan = new Scanner (System.in);

        System.out.print("Digite o x de P1: ");
        x1 = scan.nextInt();
        System.out.print("Digite o y de P1: ");
        y1 = scan.nextInt();
        System.out.print("Digite o x de P2: ");
        x2 = scan.nextInt();
        System.out.print("Digite o y de P2: ");
        y2 = scan.nextInt();
        scan.close();
        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("A distancia entre o ponto P1 (%d, %d) e o ponto P2 (%d, %d) equivale a %.1f", x1, y1, x2, y2, distancia);
    }
}
