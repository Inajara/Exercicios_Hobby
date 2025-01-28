using System; 

class URI {

    static void Main(string[] args) { 

        double tempoViagem = Double.Parse(Console.ReadLine());
        double velMedia = Double.Parse(Console.ReadLine());
        double distancia = velMedia * tempoViagem;
        double litros = distancia / 12.0;
    
        Console.WriteLine(litros.ToString("0.000"));

    }

}