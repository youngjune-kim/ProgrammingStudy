using System;
using System.Security.Cryptography.X509Certificates;

namespace class_study2
{
    class Program
    {
        class YoungMath
        {
            public static int Pow(int num, int square)
            {
                int result = 1;
                for (int i = 0; i < square; i++)
                {
                    result = num * result;
                }
                return result;
            }
        }
        static void Main(string[] args)
        {           
            Console.WriteLine("숫자를 입력해주세요");
            int num = int.Parse(Console.ReadLine());
            Console.WriteLine("제곱근을 입력해주세요");
            int square = int.Parse(Console.ReadLine());

            Console.WriteLine("결과 값은 {0}입니다.", YoungMath.Pow(num, square));
        }
    }
}

//정적 함수