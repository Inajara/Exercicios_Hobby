using System; 

class URI {

    static void Main(string[] args) { 

        int X = Convert.ToInt32(Console.ReadLine());
        double Y = Convert.ToDouble(Console.ReadLine());

        double consumo = X / Y;

        Console.WriteLine(consumo.ToString("0.000") + " km/l");

    }

}