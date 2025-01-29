#include <stdio.h>
#include <stdlib.h>

int main(){

    int codigo, qtde;
    double total = 0;
    scanf("%d", &codigo);
    scanf("%d", &qtde);

    switch (codigo)
    {
        case 1:
            total = qtde*4.00;
        break;

        case 2:
            total = qtde*4.50;
        break;

        case 3:
            total = qtde*5.00;
        break;

        case 4:
            total = qtde*2.00;
        break;

        case 5:
            total = qtde*1.50;
        break;
    }

    printf("Total: R$ %.2f\n", total);

return 0;
}