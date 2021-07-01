//Ler o valor de um raio r, calcular o comprimento da circunferência, a área do círculo e o volume da esfera correspondentes. Pesquise a classe Math do Java para o uso do PI.

package atividades;

import java.util.Scanner;
import java.lang.Math;

public class a2 {
    
    public static void main(String args[]){

        double raio, comprimento, area, volume;
        Scanner scan = new Scanner (System.in);
    
        System.out.print("Digite o valor do raio: ");
        raio = scan.nextDouble();
        scan.close();
        comprimento = 2 * Math.PI * raio;
        area = Math.PI * (raio * raio);
        volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
        System.out.printf("\nDe acordo com o raio %.1f temos:\n\nComprimento: %.1f \nArea: %.1f \nVolume: %.1f ", raio, comprimento, area, volume);
        
    }
}
