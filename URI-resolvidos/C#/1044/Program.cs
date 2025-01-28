using System; 

class URI {

    static void Main(string[] args) { 

        int x, y;
        string [] lines = Console.ReadLine().Split(' ');
        x = Int32.Parse(lines[0]);
        y = Int32.Parse(lines[1]);

        if (x % y == 0 || y % x == 0) {
            Console.WriteLine("Sao Multiplos");
        }else{
            Console.WriteLine("Nao sao Multiplos");
        }

    }

}