using System;
using System.Transactions;

namespace class_inheritance
{
    public class Person
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

    public class Student : Person
    {
        private string college;
        public Student(int age, string name, string college) : base(age, name)
        {
            this.college = college;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }
    }
}

// 클래스 상속