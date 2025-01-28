using System; 

class URI {

    static void Main(string[] args) { 

        String line1 = Console.ReadLine();
        String line2 = Console.ReadLine();

        String[] values1 = line1.Split(' ');
        int codPeca1 = Int32.Parse(values1[0]);
        int numPecas1 = Int32.Parse(values1[1]);
        double valorPeca1 = Convert.ToDouble(values1[2]);

        String[] values2 = line2.Split(' ');
        int codPeca2 = Int32.Parse(values2[0]);
        int numPecas2 = Int32.Parse(values2[1]);
        double valorPeca2 = Convert.ToDouble(values2[2]);

        double total = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);

       Console.WriteLine("VALOR A PAGAR: R$ " + total.ToString("0.00"));
    }

}