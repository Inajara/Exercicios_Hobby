using System; 

class URI {

    static void Main(string[] args) { 

       var A = Convert.ToInt32(Console.ReadLine());
       var B = Convert.ToInt32(Console.ReadLine());
       var C = Convert.ToInt32(Console.ReadLine());
       var D = Convert.ToInt32(Console.ReadLine());
       var dif = (A * B - C * D);

       Console.WriteLine("DIFERENCA = " + dif.ToString());
    }

}