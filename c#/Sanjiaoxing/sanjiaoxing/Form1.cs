using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace sanjiaoxing
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double bc1, bc2, bc3,zbc,d;

            bc1 = double.Parse(tbbc1.Text);
            bc2 = double.Parse(tbbc2.Text);
            bc3 = double.Parse(tbbc3.Text);
            zbc = bc1 + bc2 + bc3;
            d=zbc/2;
            if (bc1 + bc2 > bc3 && bc1 + bc2 > bc3 && bc2 + bc3 > bc1)
            {
                lbzbc.Text = (bc1 + bc2 + bc3).ToString();
                lbmj.Text = Math.Sqrt(d*(d-bc1)*(d-bc2)*(d-bc3)).ToString();
             }  
                else
                MessageBox.Show("三角形任意两边之和大于第三边！");
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
