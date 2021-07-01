#include <stdio.h>
#include <stdlib.h>

int main() {
    int *v;
    while (1) {
        v = (int *) malloc (100000000 * sizeof(int));
        printf ("%p\n", v);
        system("pause");
    }
    return 0;
}