package atividades;

public class vetor50 {
    public static void main(String args[]){
        int vetor[] = new int[50];
        
        for(int i=0; i<vetor.length; i++){
            vetor[i] = 101 + i;
        }
        for(int i=0; i<vetor.length; i++){
            System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
        }
    }
}
