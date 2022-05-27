using System;
using System.Data.Common;

namespace example3
{
    class Program
    {
        static void Main(string[] args)
        {
            int a;
            Console.WriteLine("정수를 입력해주세요");
            string str = Console.ReadLine();
            a = int.Parse(str);
            if (a > 10)
            {
                Console.WriteLine("a가 10보다 크다");
            }
            else if (a == 10)
            {
                Console.WriteLine("a는 10입니다.");

            }
            else
            {
                Console.WriteLine("a는 10보다 작습니다.");
            }
        }
    }
}