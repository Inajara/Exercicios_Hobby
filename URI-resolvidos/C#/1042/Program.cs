using System;
class URI {

    static void Main(string[] args) { 

        int x, y, z, M1, M2, M3;
        string[] vet = Console.ReadLine().Split(' ');
        x = Int32.Parse(vet[0]);
        y = Int32.Parse(vet[1]);
        z = Int32.Parse(vet[2]);
        M1 = Math.Min(x, Math.Min(y, z));
        M2 = 0;
        M3 = 0;

        if(x == M1){
            M2 = Math.Min(y, z);
            M3 = Math.Max(y, z);
        }
        if(y == M1){
            M2 = Math.Min(x, z);
            M3 = Math.Max(x, z);
        }
        if(z == M1){
            M2 = Math.Min(x, y);
            M3 = Math.Max(x, y);
        }

        Console.WriteLine(M1 + "\n" + M2 + "\n" + M3);
        Console.WriteLine("");
        Console.WriteLine(x + "\n" + y + "\n" + z);

    }

}