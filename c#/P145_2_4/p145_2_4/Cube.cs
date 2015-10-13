using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_4
{
    class Cube:Square
    {
        public void Superficial() 
        {
            Console.WriteLine("正方体表面积是：" + (Bc * Bc * 6));
        }
        public void Volum()
        {
            Console.WriteLine("正方体体积是：" + (Bc * Bc * Bc));
        }
    }
}
