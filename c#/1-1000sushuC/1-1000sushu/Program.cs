using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _1_1000sushu
{
    class Program
    {


       
        static void Main(string[] args)
        {
            int a=0;
            int b;
            int i;
            for (i = 2; i <= 1000; i++) 
            {
                for (b = 2; b <= i-1; b++)
                {
                    if (i%b==0) break;                   
                }

                //String.Format()
                if (i == b)
                {
                    Console.Write(i + "  ");
                    a++;
                }       

            }
            Console.WriteLine(a);
            Console.Read();
        }
    }
}


