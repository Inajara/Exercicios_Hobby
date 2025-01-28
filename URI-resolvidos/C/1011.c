#include <stdio.h>
#include <stdlib.h>

int main() {

    double r;
    scanf("%lf", &r);
    double vesfera = (4.0 / 3.0) * 3.14159 * (r * r * r) ;

    printf("VOLUME = %.3lf\n", vesfera);

    return 0;
}