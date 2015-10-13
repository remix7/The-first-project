using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace p70_3_13
{
    public partial class Form1 : Form
    {
        private const double e = 2.71828;
        public Form1()
        {
            InitializeComponent();
        }

        private void button13_Click(object sender, EventArgs e)
        {
            this.tbjg.Text = string.Empty;
            this.tbjg.Focus();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn4_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn9_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btn0_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            tbjg.Text = tbjg.Text + btn.Text;
        }

        private void btnn_Click(object sender, EventArgs e)
        {
            
            long n = long.Parse(tbjg.Text);
            long sum = 1;
            for (int i = 1; i <= n; i++) 
            {
                sum *= i;
                tbjg.Text = sum.ToString();
            }
        }

        private void btne_Click(object sender, EventArgs e)
        {
            double s = double.Parse(tbjg.Text);
            double num = Math.Pow(e, s);
            tbjg.Text = num.ToString();
            
        }
    }
}
