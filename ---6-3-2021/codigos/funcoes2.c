#include <stdio.h>
void le_vetor (int v[], int n) {
    int i;
    for (i=0; i<n; i++)
        scanf ("%d", &v[i]);
}
void mostra_vetor (int v[], int n) {
    int i;
    printf ("v = %p\nn = %d\n", v, n);
    printf ("endereco da variavel v = %p\n", &v);
    printf ("endereco da variavel n = %p\n", &n);
    for (i=0; i<n; i++) ;
        //printf ("%d\n", v[i]);
}
int main () {
    int v1[5], v2[500];
    int opcao;
    printf ("endereco da variavel opcao = %p\n", &opcao);
    printf ("digite 1 para ler vetor ou 2 para exibir vetor");
    scanf ("%d", &opcao);
    if (opcao == 1) {
        le_vetor(v1, 5);
        le_vetor(v2, 500);
    }
    else {
        printf ("endereco do vetor v1 = %p\n", v1);
        printf ("endereco da variavel v1 = %p\n", &v1);
        mostra_vetor(v1, 5);
        printf ("endereco do vetor v2 = %p\n", v2);
        printf ("endereco da variavel v2 = %p\n", &v2);
        mostra_vetor(v2, 500);
    }
    return 0;
}