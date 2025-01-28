using System; 

class URI {

    static void Main(string[] args) { 

        double r = double.Parse(Console.ReadLine());
        double pi = 3.14159;
        double volEsfera = (4.0 * pi * (Math.Pow(r, 3))) / 3.0;

        Console.WriteLine("VOLUME = " + volEsfera.ToString("0.000"));

    }

}