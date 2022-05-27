using System;

namespace for1
{
    class Program
    {
        static void Main(string[] args)
        {
            int z = 0;
            Console.WriteLine("손님의 수를 입력하세요:");
            string str = Console.ReadLine();
            int count = int.Parse(str);

            int[] a = new int[count];
            for (int i = 0; i < count; i += 1)
            {
                Console.WriteLine("{0}번째 손님의 나이를 입력하세요:", i + 1);
                str = Console.ReadLine();
                a[i] = int.Parse(str);
            }
                      
            int b = 0;
            for (int i = 0; i < count; i += 1)
            {
                if (a[i] >= 65)
                {
                    b += 7500;
                    z += b;
                }
                else if (a[i] <= 3)
                {
                    z += 0;
                }
                else if (a[i] <= 7)
                {
                    b += 5000;
                    z += b;
                }
                else if (a[i] <= 19)
                {
                    b += 8000;
                    z += b;
                }
                else {
                    b += 10000;
                    z += b;
            }                
            }
            Console.WriteLine("요금 합계는 {0}입니다.", z);
        }
    }
}
