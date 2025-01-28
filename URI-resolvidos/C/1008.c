#include <stdio.h>
#include <stdlib.h>

int main() {

    int NUMBER;
    int w;
    float SALARY;
    float p;
    scanf("%d", &NUMBER);
    scanf("%d", &w);
    scanf("%f", &p);
    SALARY = w * p;
    printf("NUMBER = %d\n", NUMBER);
    printf("SALARY = U$ %.2f\n", SALARY);

    return 0;
}