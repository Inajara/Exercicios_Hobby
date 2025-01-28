using System; 

class URI {

    static void Main(string[] args) { 

       var A = Convert.ToDouble(Console.ReadLine());
       var B = Convert.ToDouble(Console.ReadLine());
       var media = ((A * 3.5) + (B * 7.5)) / 11.0;

       Console.WriteLine("MEDIA = " + media.ToString("0.00000"));
    }

}