using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p99_3_3
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.Write("请输入一个5位的正整数：");
            int n = int.Parse(Console.ReadLine());
            Jisuan jisuan = new Jisuan();
            jisuan.n = n;            
            jisuan.jiSuan();


        }
    }
    class Jisuan
    {
        public int n;            
        public int[] array = new int[5];
        public void jiSuan()
        {
            for (int i = 0; i <5; i++)
            {
                array[i] = n % 10;
                n = n / 10;             
               
                Console.Write(" "+array[i]);
            }


            Console.WriteLine();
            Array.Sort(array);
            Console.Write("组成最大的正整数是：");
            for (int j =array.Length-1; j >= 0; j--)
            {
                Console.Write(array[j]);
            }
           

            Console.WriteLine("任意键结束！！");
            Console.Read();           
        }
    }
}
