using System;

namespace week2
{
    class Program
    {
        static void Main(string[] args)
        {
            int a;
            int b;
            int c;
            int z;
            int y;

            Console.WriteLine("a값을 입력해주세요");
            string str = Console.ReadLine();
            a = int.Parse(str);

            Console.WriteLine("b값을 입력해주세요");
            str = Console.ReadLine();
            b = int.Parse(str);

            Console.WriteLine("c값을 입력해주세요");
            str = Console.ReadLine();
            c = int.Parse(str);

            if (a <= b)
            {
                z = b;
            }
            else
            {
                z = a;
            }


            if (c >= z)
            {
                y = c;
                Console.WriteLine(y);
            }
            else
            {
                Console.WriteLine(z);
            }
        }
    }
}

