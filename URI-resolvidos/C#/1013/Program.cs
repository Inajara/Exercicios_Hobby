using System; 

class URI {

    static void Main(string[] args) { 

        String line1 = Console.ReadLine();
        String[] values1 = line1.Split(' ');
        int A = Convert.ToInt32(values1[0]);
        int B = Convert.ToInt32(values1[1]);
        int C = Convert.ToInt32(values1[2]);

        int maiorAB =  (A + B + Math.Abs(A - B)) / 2;
        int maiorABC = (maiorAB + C + Math.Abs(maiorAB - C)) / 2;

        Console.WriteLine(maiorABC + " eh o maior");

    }

}