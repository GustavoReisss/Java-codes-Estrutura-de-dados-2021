import java.util.Scanner;

public class vetor {
    public static void main(String args[]){
        int n, i;
        Scanner scan = new Scanner (System.in);
        int v[];
        System.out.print("Digite o tamanho do vetor: ");
        n = scan.nextInt();
        scan.close();
        v = new int[n]; 
        for(i=0;i<n; i++){
            v[i] = i+1;
        }
        for(i=0;i<n;i++){
            System.out.printf("\n%d : %d", i, v[i]);
        }
    }
}
