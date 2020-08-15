using System;
using System.Security.Cryptography.X509Certificates;

namespace week2_3
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] a = new int[3];
            Console.WriteLine("나이를 입력해주세요");
            string str = Console.ReadLine();
            a[0] = int.Parse(str);

            Console.WriteLine("나이를 입력해주세요");
            str = Console.ReadLine();
            a[1] = int.Parse(str);

            Console.WriteLine("나이를 입력해주세요");
            str = Console.ReadLine();
            a[2] = int.Parse(str);
         
            int z = a.Length * 10000;        
            int b;
            if (a[0] >= 65)
            {
                b = (int)(10000 * 0.25);
                z -= b;
            }
            else if (a[0] <= 3)
            {
                z -= 10000;
            }
            else if (a[0] <= 7)
            {
                b = (int)(10000 * 0.50);
                z -= b;
            }
            else if (a[0] <= 19)
            {
                b = (int)(10000 * 0.20);
                z -= b;
            }
            if (a[1] >= 65)
            {
                b = (int)(10000 * 0.25);
                z -= b;
            }
            else if (a[1] <= 3)
            {
                z -= 10000;
            }
            else if (a[1] <= 7)
            {
                b = (int)(10000 * 0.50);
                z -= b;
            }
            else if (a[1] <= 19)
            {
                b = (int)(10000 * 0.20);
                z -= b;
            }
            if (a[2] >= 65)
            {
                b = (int)(10000 * 0.25);
                z -= b;
            }
            else if (a[2] <= 3)
            {
                z -= 10000;
            }
            else if (a[2] <= 7)
            {
                b = (int)(10000 * 0.50);
                z -= b;
            }
            else if (a[2] <= 19)
            {
                b = (int)(10000 * 0.20);
                z -= b;
            }
            Console.WriteLine(z);
        }
    }
}
