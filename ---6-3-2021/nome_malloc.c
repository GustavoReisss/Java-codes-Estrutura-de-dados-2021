#include <stdio.h>
#include <stdlib.h>

int main(){

    char **nomes;
    int i;

    nomes = (char **) malloc (100 * sizeof(char *));

    for(i=0; i<100; i++){
        nomes[i] = (char *)malloc(40);
        nomes[i] = 'juninho';
    }
    for(i=0; i<100; i++){
        printf("%s\n", nomes[i]);
    }
    return 0;
}
