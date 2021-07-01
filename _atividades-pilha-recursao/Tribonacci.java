import java.util.Scanner;

public class Tribonacci {
    public static int fazTribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fazTribonacci(n - 1) + fazTribonacci(n - 2) + fazTribonacci(n - 3);
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo para saber seu numero em tribonacci: ");
        n = scan.nextInt();
        System.out.println("\nTribonacci de " + n + ": " + fazTribonacci(n));
        scan.close();
    }
}
