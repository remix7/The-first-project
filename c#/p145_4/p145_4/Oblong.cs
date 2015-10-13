using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_4
{
    class Oblong:Square
    {
        public void jiSuan() 
        {
            Console.WriteLine("周长是："+Side*4);
            Console.WriteLine("面积是："+Side*Side);
        }
    }
}
