using System; 

class URI {

    static void Main(string[] args) { 

       var A = Convert.ToInt32(Console.ReadLine());
       var B = Convert.ToInt32(Console.ReadLine());
       var produto = A * B;

       Console.WriteLine("PROD = " + produto.ToString());
    }

}