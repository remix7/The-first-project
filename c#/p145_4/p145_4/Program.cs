using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_4
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入正方形的边长：");
            int a = Console.Read();
            Square square = new Square();
            square.Side = a;
            Oblong oblong = new Oblong();
            oblong.Side = square.Side;
            oblong.jiSuan();
            Cuboid cuboid = new Cuboid();
            cuboid.Side = square.Side;
            cuboid.jiSuan();
             Console.Read();
             
        }
    }
}
