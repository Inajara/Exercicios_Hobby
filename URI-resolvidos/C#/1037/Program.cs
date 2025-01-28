using System; 

class URI {

    static void Main(string[] args) { 

        double i = Double.Parse(Console.ReadLine());
        
        if (i >= 0 && i <= 25.0000){
            Console.WriteLine("Intervalo [0,25]");
        }else if (i >= 25.00001 && i <= 50.0000000){
            Console.WriteLine("Intervalo (25,50]");
        }else if(i >= 50.00001 && i <= 75.0000000){
            Console.WriteLine("Intervalo (50,75]");
        }else if(i >= 75.00001 && i <= 100.0000000){
            Console.WriteLine("Intervalo (75,100]");
        }else{
            Console.WriteLine("Fora de intervalo");
        }
    }

}