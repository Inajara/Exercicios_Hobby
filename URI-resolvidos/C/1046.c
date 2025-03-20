#include <stdio.h>
#include <stdlib.h>
 
int main() {
 
    int ini, fin, time;
    scanf("%d %d", &ini, &fin);
    time = fin - ini;

    if (time < 0)
    {
        time = 24 + (fin - ini);
    }

    if (ini == fin)
    {
        printf("O JOGO DUROU 24 HORA(S)\n");
    }
    else
    {
        printf("O JOGO DUROU %d HORA(S)\n", time);
    }
 
    return 0;
}