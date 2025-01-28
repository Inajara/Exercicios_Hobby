using System; 

class URI {

    static void Main(string[] args) { 

        String line1 = Console.ReadLine();
        String[] values1 = line1.Split(' ');
        double A = Convert.ToDouble(values1[0]);
        double B = Convert.ToDouble(values1[1]);
        double C = Convert.ToDouble(values1[2]);
        double pi = 3.14159;

        double areaTri = (A * C) / 2.0;
        double areaCi = pi * Math.Pow(C, 2.0);
        double areaTrap = ((A + B) / 2.0) * C;
        double areaQuad = Math.Pow(B, 2.0);
        double areaRet = A * B;

        Console.WriteLine("TRIANGULO: " + areaTri.ToString("0.000"));
        Console.WriteLine("CIRCULO: " + areaCi.ToString("0.000"));
        Console.WriteLine("TRAPEZIO: " + areaTrap.ToString("0.000"));
        Console.WriteLine("QUADRADO: " + areaQuad.ToString("0.000"));
        Console.WriteLine("RETANGULO: " + areaRet.ToString("0.000"));

    }

}