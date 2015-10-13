using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Task_p83_2
{
    class Program
    {
        static void Main(string[] args)
        {
            int youxiu = 0;
            int youliang = 0;
            int zhongdeng = 0;
            int jige = 0;
            int bujige = 0;

            Console.Write("请输入班级人数：");
            int sum = int.Parse(Console.ReadLine());

            for (int i = 1; i <= sum; i++)
            {
                Console.Write("请输入第"  +i+ "学生成绩：");
                int score = int.Parse(Console.ReadLine());
                if (score>100)
                {
                    Console.WriteLine("你输入的学生成绩有误");
                    break;
                }
                if (score>=90)
                {
                    youxiu++;
                    Console.WriteLine("第" +i+ "个学生的成绩为优秀；");
                }
                if (score>=80&&score<90)
                {
                    youliang++;
                    Console.WriteLine("第" + i + "个学生的成绩为优良；");
                }
                if (score>=70&&score<80)
                {
                    zhongdeng++;
                    Console.WriteLine("第" + i + "个学生的成绩为中等；");
                }
                if (score>=60&&score<70)
                {
                    jige++;
                    Console.WriteLine("第" + i + "个学生的成绩为及格；");
                }
                if(score<60)
                {
                    bujige++;
                    Console.WriteLine("第" + i + "个学生的成绩为不及格；");
                }
            }
            Console.WriteLine("成绩为<优秀>的学生个数为：" +youxiu);
            Console.WriteLine("成绩为<优良>的学生个数为：" + youliang);
            Console.WriteLine("成绩为<中等>的学生个数为：" + zhongdeng);
            Console.WriteLine("成绩为<及格>的学生个数为：" + jige);
            Console.WriteLine("成绩为<不及格>的学生个数为：" + bujige );
            Console.WriteLine("任意键结束");
            Console.ReadLine();
        }        
    }
}
