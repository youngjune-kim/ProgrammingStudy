using System;
using System.Security.Cryptography.X509Certificates;

namespace class_test
{
    class Program
    {
        class Person
        {
            private int age;
            private string name;
            public Person(int age, string name)
            {
                this.age = age;
                this.name = name;
            }
            public int GetAge()
            {
                return age;
            }
            public string GetName()
            {
                return name;
            }

        }
        static void Main(string[] args)
        {
            int age;
            string name;
            Person[] persons = new Person[10];

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("나이를 입력해주세요");
                age = int.Parse(Console.ReadLine());
                Console.WriteLine("이름을 입력해주세요");
                name = Console.ReadLine();

                persons[i] = new Person(age, name);
            }

            for (int i = 0; i < 10; i++)
            {
                for (int j = i + 1; j < 10; j++)
                {
                    if (persons[i].GetAge() > persons[j].GetAge())
                    {
                        Person temp = persons[i];
                        persons[i] = persons[j];
                        persons[j] = temp;
                    }
                }
            }

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("이름은 {0} 입니다. 나이는 {1}입니다.", persons[i].GetAge(), persons[i].GetName());
            }
        }
    }
}
// 클래스 은닉성