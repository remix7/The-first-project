using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_1
{
    class Program
    {
        static void Main(string[] args)
        {
            Student student1 = new Student();
            student1.StudentId = 1;
            student1.Name = "李雷";
            student1.Sex = "男";
            student1.Department = "网络工程";
            student1.Specialty = "计算机网络技术";
            student1._class1 = 1;
            student1.Score = 666.6;
            student1.studengShow();


            Student student2 = new Student(2,"Meary","Female","English","spoken English",2,888.8);
            student2.studengShow();
            Console.WriteLine("--------------任意键结束------------");
            Console.Read();

        }
    }
}
