#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {

    double xa, ya, xb, yb;
    scanf("%lf", &xa);
    scanf("%lf", &ya);
    scanf("%lf", &xb);
    scanf("%lf", &yb);
    printf("%.4lf\n", sqrt(pow(xb-xa, 2.0) + pow(yb-ya, 2.0)));

    return 0;
}