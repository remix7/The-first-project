using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace daikuanjsq
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double p, r, n;
            p = double.Parse(textBox1.Text);
            r = double.Parse(textBox2.Text);
            n = double.Parse(textBox3.Text);
            label6.Text = (p * r / (1 - Math.Pow(1 + r, -1 * n))).ToString();
            label8.Text = (n * (p * r / (1 - Math.Pow(1 + r, -1 * n)))).ToString();
        }
    }
}
