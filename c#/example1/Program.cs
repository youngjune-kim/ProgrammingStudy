using System;

namespace example1
{
    class Program
    {
        static void Main(string[] args)
        {
            float a;
            float b;
            float c = 0;

            Console.Write("값을 입력해주세요: ");
            string str = Console.ReadLine();
            a = float.Parse(str);
            Console.Write("값을 입력해주세요: ");
            str = Console.ReadLine();
            b = float.Parse(str);

            // 두 변수를 곱하고 소수점을 버린 뒤 출력한다
            c = a * b;
            Console.WriteLine((char)c);
        }
    }
}
