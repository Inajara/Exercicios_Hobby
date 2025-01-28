using System; 

class URI {

    static void Main(string[] args) { 

       var NF = Convert.ToInt32(Console.ReadLine());
       var HT = Convert.ToInt32(Console.ReadLine());
       var VHT = Convert.ToDouble(Console.ReadLine());
       var salario = HT * VHT;

       Console.WriteLine("NUMBER = " + NF.ToString());
       Console.WriteLine("SALARY = U$ " + salario.ToString("0.00"));
    }

}