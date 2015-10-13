using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Task_p83_3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.tbgmje.Text = "";
            this.tbjyk.Text = "";
            this.tbyhje.Text = "";
            this.tbsfje.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            float yhje=0;
            float sfjr=0;           
           
            try
            {
                float gmje = float.Parse(tbgmje.Text);
                int jyk = int.Parse(tbjyk.Text);
                if (gmje >= 10000)
                {
                    yhje = 800;
                }
                else if (gmje >= 8000 && gmje < 10000)
                {
                    yhje = 600;
                }
                else if (gmje >= 5000 && gmje < 8000)
                {
                    yhje = 300;
                }


                switch (jyk)
                {
                    case 1:
                        {
                            yhje = yhje + (gmje * 0.01f);
                            break;
                        }
                    case 2:
                        {
                            yhje = yhje + (gmje * 0.005f);
                            break;
                        }
                    case 0: 
                        {
                            break;
                        }
                } 

                sfjr = gmje - yhje;
                this.tbyhje.Text = yhje.ToString();
                this.tbsfje.Text = sfjr.ToString();

            }
            catch (Exception)
            {
                MessageBox.Show("出错了");
            }
           
        }
    }
}
