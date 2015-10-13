using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_4
{
    class Cuboid:Square
    {
        public void jiSuan() 
        {
            Console.WriteLine("体积是：" + Side * Side * Side);
            Console.WriteLine("表面积是："+Side*Side*4);
            Console.Read();
        }
    }
}
