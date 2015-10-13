using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace p145_2_3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.tbdj.Text = "";
            this.tbjg.Text = "";
            this.tbspmc.Text = "";
            this.tbsl.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Total total = new Total();
            total.Name = tbspmc.Text;
            total.Quantity = int.Parse(tbsl.Text);
            total.Univalence = double.Parse(tbdj.Text);


            tbjg.Text = total.result().ToString();
        }
    }
}
