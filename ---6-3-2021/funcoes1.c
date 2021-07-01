#include <stdio.h>

void le_vetor(int v[]){
    int i;

    printf("=======  Ler vetor  =======\n\n");
    for(i=0; i<5; i++){
        printf("valor %d: ", i+1);
        scanf("%d", &v[i]);
    }
}

void mostra_vetor(int v[]){
    system("cls");
    printf("=======  mostra vetor vetor  =======\n\n");
    int i;
     for(i=0; i<5; i++){
        printf("valor %d: %d\n", i+1, v[i]);
    }
    system("pause");
}

int main(){
    int v[5];
    int opcao;
    do{
        system("cls");
        do{
            printf("digite 1 para ler vetor ou 2 para exibir vetor e 0 para sair: ");
            scanf("%d", &opcao);
        }while(opcao < 0 || opcao > 2);
        if(opcao == 1){
            le_vetor(v);
        }else if(opcao == 2){
            mostra_vetor(v);
        }else{
            printf("Finalizando Programa!");
        }
    }while(opcao != 0);
    return 0;
}
