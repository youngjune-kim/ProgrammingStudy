using System;

namespace class_test_2_
{
    class Program
    {
        class RegularPolygon
        {
            protected float x;
            protected string name;

            public RegularPolygon(float x, string name)
            {
                this.x = x;
                this.name = name;
            }               
            public virtual float GetArea() 
            {
                return 0;
            }

            public string GetName()
            {
                return name;
            }
        }

        class Triangle : RegularPolygon
        {
            public Triangle(float x) : base(x, "삼각형"){}
            public override float GetArea()
            {
                return (x * x) * (float)Math.Sqrt(3) / 4;
            }
        }

        class Square : RegularPolygon
        {
            public Square(float x) : base(x, "사각형") {}
            public override float GetArea()
            {
                return x * x;     
            }
        }
        
        static void Main(string[] args)
        {
            RegularPolygon rp;

            Console.WriteLine("도형을 선택해주세요.");
            string str = Console.ReadLine();
            Console.WriteLine("한 변의 길이를 입력해주세요.");
            int x = int.Parse(Console.ReadLine());

            if (str == "사각형")
            {
                rp = new Square(x);
            }
            else
            {
                rp = new Triangle((float)x);
            }

            Console.WriteLine("{0}의 넓이는 {1} 입니다.", rp.GetName() ,rp.GetArea());
        }
    }
}
