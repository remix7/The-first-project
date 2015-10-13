using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace sum_1_100_C
{
    class Program
    {
        static void Main(string[] args)
        {
            int a=0;
            int b;
            for (b = 1; b <= 100000; b++) {
                a += b;    
            }
            Console.WriteLine(a);
            Console.Read();
        }
    }
}
