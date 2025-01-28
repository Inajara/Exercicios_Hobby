using System; 

class URI {

    static void Main(string[] args) { 

        string [] lines = Console.ReadLine().Split(' ');
        int A = Int32.Parse(lines[0]);
        int B = Int32.Parse(lines[1]);
        int C = Int32.Parse(lines[2]);
        int D = Int32.Parse(lines[3]);
        int s1 = C + D;
        int s2 = A + B;

        if ((B > C) && (D > A) && (s1 > s2) && C > 0 && D > 0 && (A % 2 == 0))
        {
            Console.WriteLine("Valores aceitos");
        }else
        {
            Console.WriteLine("Valores nao aceitos");
        }
    }

}