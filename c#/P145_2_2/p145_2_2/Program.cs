using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_2
{
    class Program
    {
        static void Main(string[] args)
        {
            Performance p1 = new Performance();
            Console.Write("请输入学号：");
            p1.Id = int.Parse(Console.ReadLine());       
            Console.Write("请输入姓名：");
            p1.Name = Console.ReadLine();
            Console.Write("英语成绩是：");
            p1.EnglishPerformance = double.Parse(Console.ReadLine());
            Console.Write("数学成绩是：");
            p1.MathPerformance = double.Parse(Console.ReadLine());
            Console.Write("数据库成绩是：");
            p1.DbsPerformance = double.Parse(Console.ReadLine());
          
            p1.Result();
            Console.Read();
        }
    }
}
