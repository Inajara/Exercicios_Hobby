#include <stdio.h>
#include <stdlib.h>

int main() {

    char nome;
    double V;
    double SB;
    double SL ;
    scanf("%s", &nome);
    scanf("%lf", &SB);
    scanf("%lf", &V);
    SL = (SB + (15 * V) / 100);
    printf("TOTAL = R$ %.2lf\n", SL);

    return 0;
}