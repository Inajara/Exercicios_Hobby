#include <stdio.h>
#include <stdlib.h>

int main() {

    int tempo, vmedia;
    scanf("%d", &tempo);
    scanf("%d", &vmedia);
    float litro = (tempo * vmedia) / 12.0;

    printf("%.3f\n", litro);

    return 0;
}