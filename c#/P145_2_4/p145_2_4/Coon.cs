using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_4
{
    class Coon:Square
    {
        private double yzg;

        public double Yzg
        {
            get { return yzg; }
            set { yzg = value; }
        }
        public Coon() { }
        public void Area()
        {
            Console.WriteLine("圆锥体积是：" + ((((Bc / 2) * (Bc / 2) * (Bc / 2) * 3.14159)/3)));
        }   

    }
}
