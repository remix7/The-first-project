using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_4
{
    class Square
    {
        private double bc;

        public double Bc
        {
            get { return bc; }
            set { bc = value; }
        }
        public Square() { }
        public Square(double bc )
        {
            this.Bc = bc;          
        }
    }
}
