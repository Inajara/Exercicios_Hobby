using System; 

class URI {

    static void Main(string[] args) { 

        String line1 = Console.ReadLine();
        String line2 = Console.ReadLine();
        String[] values1 = line1.Split(' ');
        String[] values2 = line2.Split(' ');

        double xone = Convert.ToDouble(values1[0]);
        double yone = Convert.ToDouble(values1[1]);

        double xtwo = Convert.ToDouble(values2[0]);
        double ytwo = Convert.ToDouble(values2[1]);

        double distancia = Math.Sqrt(Math.Pow((xtwo - xone), 2.00) + Math.Pow((ytwo - yone), 2.00));

        Console.WriteLine(distancia.ToString("0.0000"));

    }

}