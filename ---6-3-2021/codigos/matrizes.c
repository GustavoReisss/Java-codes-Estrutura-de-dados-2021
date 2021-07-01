#include <stdio.h>
#include <stdlib.h>

int main () {
    int i;
    int * pi;
    int ** ppi;

    int ** m;
    int m1[3][4];

    pi = &i;
    ppi = &pi;

    m = (int **) malloc (3 * sizeof(int *));
    for (i=0; i<3; i++) {
        m[i] = (int *) malloc (4 * sizeof(int));
    }
    return 0;
}