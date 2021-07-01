import java.util.Scanner;
import java.util.Random;
import java.util.Date;

public class ordenacao {
    //exibir um vetor
    static void exibeVetor (int [] v, String msg) {
        System.out.println("\n"+msg+"\n");
        for (int i=0; i<v.length; i++) {
            System.out.printf("%d  ", v[i]);
        }
        System.out.println();
    }

    static void preencheVetor(int v[]){
        Random r = new Random();
        for( int i=0; i<v.length;i++){
            v[i] = r.nextInt(v.length * 10);
        }
    }

    static void bubbleSort(int v[]){
        for(int i=1;i<v.length;i++){
            for(int j=0; j<v.length - i;j++){
                if(v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        char continua;
        do{
            System.out.print("Digite o tamanho do vetor: ");
            int n = entrada.nextInt();
            int v[] = new int[n];
            //exibeVetor(v, "Vetor zerado");
            preencheVetor(v);
            //exibeVetor(v, "Vetor bagunçado:");
            long inicio = new Date().getTime();
            bubbleSort(v);
            long fim = new Date().getTime();
            System.out.println("\ntempo de ordenacao para o tamanho " + n + "= " +((fim-inicio)/1000) + "s\n");
            //exibeVetor(v, "Vetor ordenado:");
            entrada.nextLine(); // limpa o buffer do enter anterior
            System.out.println("Executar novamente? (s/n)");
            //String aux = entrada.nextLine();
            continua = entrada.nextLine().toLowerCase().charAt(0);

            //continua = aux.charAt(0); // pega o primeiro char da string aux
        }while(continua == 's' || continua == 'S');
        entrada.close();
    }
}