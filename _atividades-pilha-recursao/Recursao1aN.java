import java.util.Scanner;

public class Recursao1aN {

    public static int soma(int n) {
        if (n == 0) {
            return 0;
        }
        return n + soma(n - 1);

    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo para saber sua soma de 1 a N: ");
        n = scan.nextInt();
        System.out.println("A soma de 1 a " + n + " equivale a: " + soma(n));
        scan.close();
    }
}
