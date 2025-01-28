#include <stdio.h>
#include <stdlib.h>

int main() {

    int cod1, num1;
    float price1;
    scanf("%d", &cod1);
    scanf("%d", &num1);
    scanf("%f", &price1);
    float part1 = num1 * price1;

    int cod2, num2;
    float price2;
    scanf("%d", &cod2);
    scanf("%d", &num2);
    scanf("%f", &price2);
    float part2 = num2 * price2;

    float total = part1 + part2;
    printf("VALOR A PAGAR: R$ %.2f\n", total);

    return 0;
}