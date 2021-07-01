import java.util.Scanner;

public class ImprimePar0aN {

    public static void imprimePar(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        imprimePar(n - 2);
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo PAR, para saber todos os numeros pares de N a 0: ");
        n = scan.nextInt();
        System.out.println("\nPares de " + n + " a 0:");
        imprimePar(n);
        scan.close();
    }
}
