#include <stdio.h>
#include <stdlib.h>

void preenche_vetor (int *v, int n) {
    int i;
    for (i=0; i<n; i++) {
        v[i] = i*10;
    }
    v = (int *) malloc (5 * sizeof (int));
}
void outro_vetor (int **v, int n);
    *v = (int *) malloc (n * sizeof(int)); 
}
int main () {
    int *v = (int *) malloc (5 * sizeof(int));
    //preenche_vetor (v, 5);
    outro_vetor (&v, 10);
    return 0;
}