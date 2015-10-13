using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_4
{
    class Program
    {
        static void Main(string[] args)
        {
            GirthAcreage ga = new GirthAcreage();
            Console.Write("请输入边长:");
            ga.Bc = double.Parse(Console.ReadLine());
            ga.Girth();
            ga.Acreage();
            Cube cb = new Cube();
            cb.Bc = ga.Bc;
            cb.Superficial();
            cb.Volum();
            Round ro = new Round();
            ro.Bc = ga.Bc;
            ro.Girth();
            ro.Area();
            Coon co = new Coon();
            co.Bc = ga.Bc;
            co.Area();
            Console.Read();

        }
    }
}
