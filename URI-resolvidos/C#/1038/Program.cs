using System; 

class URI {

    static void Main(string[] args) { 

        string [] lines = Console.ReadLine().Split(' ');
        int codigo = Int32.Parse(lines[0]);
        int qtde = Int32.Parse(lines[1]);
        double total = 0.00;

        switch (codigo)
        {
            case 1:
            total = qtde * 4.00;
            break;
            case 2:
            total = qtde * 4.50;
            break;
            case 3:
            total = qtde * 5.00;
            break;
            case 4:
            total = qtde * 2.00;
            break;
            case 5:
            total = qtde * 1.50;
            break;
        }

        Console.WriteLine("Total: R$ " + total.ToString("0.00"));

    }

}