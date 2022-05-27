using System;

namespace Calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            float a;
            float b;
            float result = 0;
            
            Console.Write("값을 입력해주세요: ");
            string str = Console.ReadLine();
            a = float.Parse(str);
            Console.Write("값을 입력해주세요: ");
            str = Console.ReadLine();
            b = float.Parse(str);
            Console.Write("어떤 연산을 하시겠습니까 고객님?");
            str = Console.ReadLine();

            if (str == "+")
            {
                result = a + b;
            } else if (str == "-")
            {
                result = a - b;
            } else if (str == "*")
            {
                result = a * b;
            } else if (str == "/")
            {
                result = a / b;
            } else
            {
                Console.WriteLine("올바른 연산자를 입력해주세요.");
            }

            Console.WriteLine(String.Format("result: {0}", result));
        }
    }
}
