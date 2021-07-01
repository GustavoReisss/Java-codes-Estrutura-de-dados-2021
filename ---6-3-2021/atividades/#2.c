#include <stdio.h>
#include <stdlib.h>
#define PI 3.14
void calc_esfera(float r, float *area, float *volume);

int main(){

    float r, area, volume;

    printf("Digite o valor do raio da esfera: ");
    scanf("%f", &r);
    calc_esfera(r, &area, &volume);
    printf("\nDado o raio %.2f temos:\n\nArea: %.2f\nVolume: %.2f", r, area, volume);
    return 0;
}
void calc_esfera(float r, float *area, float *volume){

    *area = 4 * PI * (r*r);
    *volume = (4 * PI * (r*r*r))/ 3;
    return;
}
