using System;

namespace switch_case
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("이름을 입력해주세요");
            string str = Console.ReadLine();

            switch (str)
            {
                case "영준":
                    Console.WriteLine("영준이는 24살이다.");
                    break;
                case "준혁":
                    Console.WriteLine("준혁이는 29살이다.");
                    break;
                case "다정":
                    Console.WriteLine("다정이는 24살이다.");
                    break;
                default:
                    Console.WriteLine("나이를 알 수가 없다");
                    break;
            }
        }
    }
}
