using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_3
{
    class Total
    {
        private string _name;       
        private double _univalence;
        private int _quantity;


        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }
        public int Quantity
        {
            get { return _quantity; }
            set { _quantity = value; }
        }
        public double Univalence
        {
            get { return _univalence; }
            set { _univalence = value; }
        }
        public Total() { }
        public Total(double Univalence, int Quantity)
        {
            this.Univalence = Univalence;
            this.Quantity = Quantity;
        }
        public double result()
        {
            return Univalence * Quantity;
        }

    }

}
