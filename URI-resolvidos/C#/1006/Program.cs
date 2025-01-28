using System; 

class URI {

    static void Main(string[] args) { 

       var A = Convert.ToDouble(Console.ReadLine());
       var B = Convert.ToDouble(Console.ReadLine());
       var C = Convert.ToDouble(Console.ReadLine());
       var media = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10.0;

       Console.WriteLine("MEDIA = " + media.ToString("0.0"));
    }

}