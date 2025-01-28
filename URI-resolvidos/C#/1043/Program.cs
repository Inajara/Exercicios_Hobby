using System; 

class URI {

    static void Main(string[] args) { 

        double a, b, c, x, y, z, areaTrapezio, periTriangulo;
        string [] lines = Console.ReadLine().Split(' ');
        a = Double.Parse(lines[0]);
        b = Double.Parse(lines[1]);
        c = Double.Parse(lines[2]);
        x = Math.Max(a, Math.Max(b, c));
        y = 0;
        z = 0;
        areaTrapezio = ((a + b) * c) / 2;
        periTriangulo = a + b + c;

        if(x == a){
            y = Math.Max(b, c);
            z = Math.Min(b, c);
        }
        if(x == b){
            y = Math.Max(a, c);
            z = Math.Min(a, c);
        }
        if(x == c){
            y = Math.Max(b, a);
            z = Math.Min(b, a);
        }

        if (x >= (y + z)) {
            Console.WriteLine("Area = " + areaTrapezio.ToString("F1"));
        }else{
            Console.WriteLine("Perimetro = " + periTriangulo.ToString("F1"));
        }

    }

}