#include <stdio.h>
#include <stdlib.h>

int main() {
 
    int ini, fin, ini2, fin2, time, time2, h24, res;
    scanf("%d %d %d %d", &ini, &ini2, &fin, &fin2);

    time = (ini * 60) + ini2;
    time2 = (fin * 60) + fin2;
    h24 = (24 * 60);
    res = 0;

    if (time2 > time)
    {
        res = time2 - time;
        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (res / 60), (res % 60));
    }
    else if (time > time2)
    {
        res = (h24 - time) + (time2);
        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (res / 60), (res % 60));
    }
    else if (time2 == time)
    {
        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24, 0);
    } 
 
    return 0;
}