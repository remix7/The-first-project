using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace p70
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text += btn.Text; 
        }

        private void button4_Click(object sender, EventArgs e)
        {
            int n = int.Parse(tbjg.Text);
            long s = 1;
            for (int i = 1; i <= n; i++) 
            {
                s *= i;
            }
            tbjg.Text = s.ToString();
        }

        private void button13_Click(object sender, EventArgs e)
        {
            tbjg.Text = "";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            double x = double.Parse(tbjg.Text);
            const double e1 = 2.71828;
            double s =  Math.Pow(e1, x);
            tbjg.Text = s.ToString();
        }
    }
}
