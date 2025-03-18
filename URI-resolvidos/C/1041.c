#include <stdio.h>
#include <stdlib.h>

int main(){

    double eixoX, eixoY;
    scanf("%lf", &eixoX);
    scanf("%lf", &eixoY);

    if (eixoX == 0 && eixoY == 0)
    {
        printf("Origem\n");
    }
    else if (eixoX == 0)
    {
        printf("Eixo Y\n");
    }
    else if (eixoY == 0)
    {
        printf("Eixo X\n");
    }
    else if (eixoX > 0 && eixoY > 0)
    {
        printf("Q1\n");
    }
    else if (eixoX < 0 && eixoY > 0)
    {
        printf("Q2\n");
    }
    else if (eixoX < 0 && eixoY < 0)
    {
        printf("Q3\n");
    }
    else if (eixoX > 0 && eixoY < 0)
    {
        printf("Q4\n");
    }

return 0;
}