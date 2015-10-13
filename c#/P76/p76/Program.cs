using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p76
{
    class Program
    {
        static void Main(string[] args)
        {
            int sum;
            int chengji;
            Console.Write("请输入班级个数：");
            int n = int.Parse(Console.ReadLine());
            Console.Write("请输入学生个数：");
            int s = int.Parse(Console.ReadLine());
            for (int i = 1; i <= n; i++)
            {
                sum = 0;
                Console.WriteLine("请输入第{0}个班的成绩：" ,i);
                for (int j = 1; j <= s; j++) 
                {
                    Console.Write("请输入第{0}个学生的成绩：",j);
                    chengji = int.Parse(Console.ReadLine());
                    sum += chengji;
                }
                int avg;
                avg = sum / s;
                Console.WriteLine("第{0}个班的平均成绩为：{1}",i,avg);
            }
            Console.WriteLine("任意键结束");
            Console.ReadLine();
            
        }
    }
}
