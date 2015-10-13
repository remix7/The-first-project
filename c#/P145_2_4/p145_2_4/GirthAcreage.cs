using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_4
{
    class GirthAcreage:Square
    {
        public void Girth() 
        {
            Console.WriteLine("正方形周长是：" + (Bc * 4));
        }
        public void Acreage() 
        {
            Console.WriteLine("正方形面积是：" + (Bc * Bc));
        }
       
    }
}
