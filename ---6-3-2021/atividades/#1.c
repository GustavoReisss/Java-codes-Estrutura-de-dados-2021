#include <stdio.h>
#include <stdlib.h>
void partes(float num, int *inteiro, float *fracionaria);

int main(){

    float num, fracionaria;
    int inteiro;

    printf("Digite um numero real: ");
    scanf("%f", &num);
    partes(num, &inteiro, &fracionaria);
    printf("\nparte inteira: %d\nparte fracionaria: %f", inteiro, fracionaria);

    return 0;
}
void partes(float num, int *inteiro, float *fracionaria){

    *inteiro = (int)num;
    *fracionaria = num - *inteiro;
    return;
}
