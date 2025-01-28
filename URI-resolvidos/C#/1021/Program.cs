using System; 

class URI {

    static void Main(string[] args) { 

        double dinheiro = Double.Parse(Console.ReadLine());
        
        Console.WriteLine("NOTAS:");

        Console.WriteLine("{0} nota(s) de R$ 100.00", (int) dinheiro / 100);

        dinheiro = dinheiro % 100;
        Console.WriteLine("{0} nota(s) de R$ 50.00", (int) dinheiro / 50);

        dinheiro = dinheiro % 50;
        Console.WriteLine("{0} nota(s) de R$ 20.00", (int) dinheiro / 20);

        dinheiro = dinheiro % 20;
        Console.WriteLine("{0} nota(s) de R$ 10.00", (int) dinheiro / 10);

        dinheiro = dinheiro % 10;
        Console.WriteLine("{0} nota(s) de R$ 5.00", (int) dinheiro / 5);

        dinheiro = dinheiro % 5;
        Console.WriteLine("{0} nota(s) de R$ 2.00", (int) dinheiro / 2);

        dinheiro = dinheiro % 2;
        dinheiro = dinheiro * 100;
       Console.WriteLine("MOEDAS:");
       Console.WriteLine("{0} moeda(s) de R$ 1.00", (int) dinheiro / 100);

        dinheiro = dinheiro % 100;
        Console.WriteLine("{0} moeda(s) de R$ 0.50", (int) dinheiro / 50);

        dinheiro = dinheiro % 50;
        Console.WriteLine("{0} moeda(s) de R$ 0.25", (int) dinheiro / 25);

        dinheiro = dinheiro % 25;
        Console.WriteLine("{0} moeda(s) de R$ 0.10", (int) dinheiro / 10);

        dinheiro = dinheiro % 10;
        Console.WriteLine("{0} moeda(s) de R$ 0.05", (int) dinheiro / 5);

        dinheiro = dinheiro % 5;
        Console.WriteLine("{0} moeda(s) de R$ 0.01", (int) dinheiro);
    }

}