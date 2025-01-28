#include <stdio.h>
#include <stdlib.h>

int main() {

    double A, B, C;
    scanf("%lf", &A);
    scanf("%lf", &B);
    scanf("%lf", &C);

    double areat = (A * C) / 2.0;
    double areac = (C * C) * 3.14159;
    double areatr = ((A + B) * C) / 2.0;
    double areaq = B *B;
    double arear = A * B;

    printf("TRIANGULO: %.3lf\n", areat);
    printf("CIRCULO: %.3lf\n", areac);
    printf("TRAPEZIO: %.3lf\n", areatr);
    printf("QUADRADO: %.3lf\n", areaq);
    printf("RETANGULO: %.3lf\n", arear);

    return 0;
}