#include <stdio.h>
#include <stdlib.h>

int main() {

    int a, b, c;
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    int mab = (a + b + abs(a - b)) / 2;
    int mbc = (mab + c + abs(mab - c)) / 2;

    printf("%d eh o maior\n", mbc);

    return 0;
}