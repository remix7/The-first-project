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

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            int p, r, n, y;
            p = int.Parse(tbje.Text);
            r = int.Parse(tbll.Text);
            n = int.Parse(tbsj.Text);
           // y = p * r / (1 - Math.Pow(1 + r, -1 * n));

            //lbyfk.Text = p * r / (1 - Math.Pow(1 + r, -1 * n)).ToString;
            //lbzfk.Text = n * p * r / (1 - Math.Pow(1 + r, -1 * n)).ToString;
            
        }
    }
}
