#include <stdio.h>
#include <stdlib.h>

int main() {

    int d;
    scanf("%d", &d);
    int min = (60 * d) / 30;

    printf("%.d minutos\n", min);

    return 0;
}