#include <stdio.h>
#include <stdlib.h>
int main(){
    //int v[1000000];
    int *v, i;
    v = (int *) malloc(1000000*sizeof(int));
    for(i=0;i<10;i++){
        v[i] = i;
        printf("  %d\  ", v[i]);
    }
    printf("Tamanho alocado para v = %d\n", sizeof(v));
    printf("onde comeca o vetor: %p\n", v);
    return 0;
}
