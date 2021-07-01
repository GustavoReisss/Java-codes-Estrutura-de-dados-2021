#include <stdio.h>
#include <stdlib.h>

void contador(int n, int **v, int *maior, int *vezes);

int main(){
    int n, i, maior, vezes;
    int *v;
    printf("digite a quantidade de posicoes do vetor: ");
    scanf("%d", &n);
    printf("\n");
    v = (int *) malloc (n * sizeof(int));
    for(i=0;i<n;i++){
        printf("\tinteiro %d: ", i+1);
        scanf("%d", &v[i]);
    }
    maior = v[0];
    vezes = 0;
    contador(n, v, &maior, &vezes);
     printf("\nO maior valor do vetor foi %d e apareceu %d vez(es)\n", maior, vezes);
    return 0;
}
void contador(int n, int **v, int *maior, int *vezes){
    int i;

    for(i=0;i<n;i++){
        if(v[i] > *maior){
            *maior = v[i];
            *vezes = 1;
        }
        else if(v[i] == *maior){
            *vezes += 1;
        }
    }

    return;
}
