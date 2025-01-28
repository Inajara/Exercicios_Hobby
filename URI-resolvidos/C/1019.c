#include <stdio.h>
#include <stdlib.h>

int main () {

    int N;
    scanf("%d", &N);
    int H = N/3600;
    int M = (N%3600)/60;
    int S = (N%3600)%60;

    printf("%d:%d:%d\n", H, M, S);

return 0;
}