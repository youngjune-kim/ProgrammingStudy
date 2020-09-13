using System;

namespace class_week
{
    class Transportation
    {
        protected int price;
        protected int time;
        protected string name;
        public Transportation(int price, int time, string name)
        {
            this.price = price;
            this.time = time;
            this.name = name;
        }
        public virtual string GetInfo()
        {
            return "";           
        } 
    }
    class Bus : Transportation
    {
        private static readonly int PRICE = 25000;
        private static readonly int TIME = 6;
        private static readonly string NAME = "Bus";
        public Bus() : base(PRICE, TIME, NAME) { }
        public override string GetInfo()
        {
            string s = String.Format("버스 이름은 {0} 요금은 {1} 시간은 {2}입니다.", price, time, name);
            return s;
        }
    }
    class Train : Transportation
    {
        private static readonly int PRICE = 30000;
        private static readonly int TIME = 5;
        private static readonly string NAME = "Train";

        public Train() : base(PRICE, TIME, NAME) { }

        public override string GetInfo()
        {
            string s = String.Format("기차 이름은 {0} 요금은 {1} 시간은 {2}입니다.", price, time, name);
            return s;
        }
    }
    class Airplane : Transportation
    {
        private static readonly int PRICE = 100000;
        private static readonly int TIME = 1;
        private static readonly string NAME = "Airplane";

        protected int value;
        public Airplane() : base(PRICE, TIME, NAME)
        {
            value = price * time;
        }
        public override string GetInfo()
        {
            string s = String.Format("비행기 이름은 {0} 요금은 {1} 시간은 {2}입니다.", price, time, name);
            return s;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Transportation rp = null;
            Console.WriteLine("탑승 수단을 선택해주세요");
            string str = Console.ReadLine();

            if (str == "버스")
            {
                rp = new Bus();
            }
            else if (str == "기차")
            {
                rp = new Train();
            }
            else if (str == "비행기")
            {
                rp = new Airplane();
            }

            Console.WriteLine("이동 수단 정보 {0}", rp.GetInfo());
        }
    }
}
//클래스 다형성


