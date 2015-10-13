using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_4
{
    class Square
    {
        double _side;

        public double Side
        {
            get { return _side; }
            set { _side = value; }
        }
        
        public Square() { }
        public Square(double _side) 
        {          
            this._side = _side;
        }

    }
}
