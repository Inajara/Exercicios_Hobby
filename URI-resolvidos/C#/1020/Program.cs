using System; 

class URI {

    static void Main(string[] args) { 

        var idade = int.Parse(Console.ReadLine());

        var ano = idade /365;
        var mes = (idade % 365) / 30;
        var dia = idade % 365 % 30;

        Console.WriteLine(ano + " ano(s)");
        Console.WriteLine(mes + " mes(es)");
        Console.WriteLine(dia + " dia(s)");
    }

}