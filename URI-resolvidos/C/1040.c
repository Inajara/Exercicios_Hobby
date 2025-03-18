#include <stdio.h>
#include <stdlib.h>

int main(){

    double nota1, nota2, nota3, nota4, rec, notaFinal;
    scanf("%lf", &nota1);
    scanf("%lf", &nota2);
    scanf("%lf", &nota3);
    scanf("%lf", &nota4);

    double media = (((nota1*2.0)+(nota2*3.0)+(nota3*4.0)+(nota4*1.0))/10.0);
    printf("Media: %.1f\n", media);

    if (media >= 7.0)
    {
        printf("Aluno aprovado.\n");
    }
    else if (media <= 6.9 && media >= 5.0)
    {
        printf("Aluno em exame.\n");
        scanf("%lf", &rec);
        printf("Nota do exame: %.1f\n", rec);
        notaFinal = ((media+rec)/2.0);
        if (notaFinal >= 5.0)
        {
            printf("Aluno aprovado.\n");
        }
        else
        {
            printf("Aluno reprovado.\n");
        }
        printf("Media final: %.1f\n", notaFinal);
    }
    else
    {
        printf("Aluno reprovado.\n");
    }
    

return 0;
}