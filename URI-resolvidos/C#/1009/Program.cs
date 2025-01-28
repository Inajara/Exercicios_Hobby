using System; 

class URI {

    static void Main(string[] args) { 

       var nome = Convert.ToString(Console.ReadLine());
       var SB = Convert.ToDouble(Console.ReadLine());
       var VM = Convert.ToDouble(Console.ReadLine());
       var salario = SB + (VM * 0.15);

       Console.WriteLine("TOTAL = R$ " + salario.ToString("0.00"));
    }

}