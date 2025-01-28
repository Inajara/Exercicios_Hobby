using System; 

class URI {

    static void Main(string[] args) { 

       var r = Convert.ToDouble(Console.ReadLine());
       var pi = Convert.ToDouble(3.14159);
       var area = Convert.ToDouble(pi*(Math.Pow(r, 2.0)));

       Console.WriteLine("A=" + area.ToString("0.0000"));
    }

}