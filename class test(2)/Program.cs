using System;
using System.Numerics;


namespace class_test_2_
{
    class Program
    {
        class Triangle
        {
            private float x;
            public Triangle(float x)
            {
                this.x = x;
            }
            public float GetArea()
            {
                return (x * x) * (float)Math.Sqrt(3) / 4;
            }
        }

        class Square
        {
            private float x;
            public Square(float x)
            {
                this.x = x;
            }
            public float GetArea()
            {
                return x * x;     
            }
        }
        
        static void Main(string[] args)
        {
            Console.WriteLine("도형을 선택해주세요.");
            string str = Console.ReadLine();

            if (str == "사각형")
            {
                Console.WriteLine("한 변의 길이를 입력해주세요.");
                int x = int.Parse(Console.ReadLine());
                Square t = new Square(x);
                Console.WriteLine("사각형의 넓이는 {0} 입니다.", t.GetArea());
            }
            else if (str == "삼각형")
            {
                Console.WriteLine("한 변의 길이를 입력해주세요.");
                double x = double.Parse(Console.ReadLine());
                Triangle t = new Triangle((float)x);
                Console.WriteLine("삼각형의 넓이는 {0} 입니다.", t.GetArea());
            }
        }
    }
}

// 맴버 함수