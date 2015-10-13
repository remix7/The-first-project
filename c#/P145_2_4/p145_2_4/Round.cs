using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_4
{
    class Round:Square
    {
        public void Girth()
        {
            Console.WriteLine("正方形内切圆周长是："+(Bc*3.14159));
        }   
        public void Area()
        {
            Console.WriteLine("正方形内切圆面积是："+((Bc/2)*(Bc/2)*3.14159));
        }   
    }
}
