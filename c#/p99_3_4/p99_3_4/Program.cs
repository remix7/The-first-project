using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p99_3_4
{
    class Program
    {
        static void Main(string[] args)
        {
            Scheme scheme = new Scheme();
            scheme.exchinge();
        }
    }
    class Scheme 
    {
        int sum=0;
        public void exchinge() 
        {
            for (int i = 1; i <= 5; i++)
            {
                for (int j = 1; j <= 10; j++)
                {
                    for (int k = 1; k <= 20; k++)
                    {
                        for (int l = 1; l < 100; l++)
                        {
                            if (i*20+j*10+k*5+l==100)
                            {
                                sum++;
                                Console.WriteLine("分别是：20元的"+i+"张、"+"10元"+j+"张、"+"5元"+k+"张、"+"1元"+l+"张；");
                            }
                        }
                    }
                }
            }
            Console.WriteLine("一共有"+sum+"种方案");
            Console.WriteLine("任意键结束；");
            Console.Read();
        }
    }
}
