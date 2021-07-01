import java.util.Scanner;

public class TesteN10paraN2 {
    public static void main(String[] args) {
        Conversao10pra2 num;
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um inteiro na base 10 para saber seu equivalente em base 2: ");
        n = scan.nextInt();
        num = new Conversao10pra2(n);
        num.n10ParaN2();
        System.out.println("O numero " + n + " na base 10 equivale a " + num + " na base 2");
        scan.close();
    }
}
