using System; 

class URI {

    static void Main(string[] args) { 

        string [] lines = Console.ReadLine().Split(' ');
        double A = Double.Parse(lines[0]);
        double B = Double.Parse(lines[1]);
        double C = Double.Parse(lines[2]);

        double BK = (Math.Pow(B, 2.00) - 4 * A * C);
        double R1 = (-B + Math.Sqrt(BK)) / (2.00 * A);
        double R2 = (-B - Math.Sqrt(BK)) / (2.00 * A);
        
        if (BK < 0 || A == 0)
        {
            Console.WriteLine("Impossivel calcular");
        }else
        {
            Console.WriteLine("R1 = " + R1.ToString("0.00000"));
            Console.WriteLine("R2 = " + R2.ToString("0.00000"));
        }
    }

}