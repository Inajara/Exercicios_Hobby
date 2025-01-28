using System; 

class URI {

    static void Main(string[] args) { 

        int dinheiro = Int32.Parse(Console.ReadLine());
        
        Console.WriteLine(dinheiro);

        Console.WriteLine("{0} nota(s) de R$ 100,00", dinheiro / 100);

        dinheiro = dinheiro % 100;
        Console.WriteLine("{0} nota(s) de R$ 50,00", dinheiro / 50);

        dinheiro = dinheiro % 50;
        Console.WriteLine("{0} nota(s) de R$ 20,00", dinheiro / 20);

        dinheiro = dinheiro % 20;
        Console.WriteLine("{0} nota(s) de R$ 10,00", dinheiro / 10);

        dinheiro = dinheiro % 10;
        Console.WriteLine("{0} nota(s) de R$ 5,00", dinheiro / 5);

        dinheiro = dinheiro % 5;
        Console.WriteLine("{0} nota(s) de R$ 2,00", dinheiro / 2);

        dinheiro = dinheiro % 2;
        Console.WriteLine("{0} nota(s) de R$ 1,00", dinheiro);
    }

}