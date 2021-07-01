import java.util.Scanner;

public class EntradaSaida {
    public static void main(String args[]){
        int i = 2, j = 3, v[];
        double d = 0.75;

        Scanner entrada;

        entrada = new Scanner(System.in);

        System.out.printf("soma = %.2f\n", i+d);
        System.out.print("soma = " + (i+d) + "\n");
        System.out.println("multiplicao = " + i*j);
        System.out.println("Digite um inteiro: ");
        i = entrada.nextInt();

        System.out.println("digite um double: ");
        d = entrada.nextDouble();

        System.out.println("Digite o tamanho do vetor: ");
        j = entrada.nextInt();
        entrada.close();
        v = new int[j];

        for(i=0;i<v.length;i++){
            v[i] = i+1;
            System.out.printf("\n%d", v[i]);
        }
    }
}
