#include <stdio.h>
#include <stdlib.h>

int * devolve_vetor(int);

int main(){
    int *x;
    x = devolve_vetor(10);
    return 0;
}

int * devolve_vetor(int n){
    int *v = (int *) malloc (n * sizeof(int));
    free(v);
    return v;
}
