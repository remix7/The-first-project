﻿namespace sanjiaoxing
{
    partial class Form1
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.tbbc1 = new System.Windows.Forms.TextBox();
            this.tbbc3 = new System.Windows.Forms.TextBox();
            this.tbbc2 = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.lbzbc = new System.Windows.Forms.Label();
            this.lbmj = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // tbbc1
            // 
            this.tbbc1.Location = new System.Drawing.Point(128, 46);
            this.tbbc1.Name = "tbbc1";
            this.tbbc1.Size = new System.Drawing.Size(100, 21);
            this.tbbc1.TabIndex = 0;
            // 
            // tbbc3
            // 
            this.tbbc3.Location = new System.Drawing.Point(128, 146);
            this.tbbc3.Name = "tbbc3";
            this.tbbc3.Size = new System.Drawing.Size(100, 21);
            this.tbbc3.TabIndex = 1;
            // 
            // tbbc2
            // 
            this.tbbc2.Location = new System.Drawing.Point(128, 96);
            this.tbbc2.Name = "tbbc2";
            this.tbbc2.Size = new System.Drawing.Size(100, 21);
            this.tbbc2.TabIndex = 2;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(27, 46);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 12);
            this.label1.TabIndex = 3;
            this.label1.Text = "三角形三边";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(29, 195);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 12);
            this.label2.TabIndex = 4;
            this.label2.Text = "总边长";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(29, 242);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(29, 12);
            this.label3.TabIndex = 5;
            this.label3.Text = "面积";
            // 
            // lbzbc
            // 
            this.lbzbc.AutoSize = true;
            this.lbzbc.Location = new System.Drawing.Point(128, 195);
            this.lbzbc.Name = "lbzbc";
            this.lbzbc.Size = new System.Drawing.Size(0, 12);
            this.lbzbc.TabIndex = 6;
            // 
            // lbmj
            // 
            this.lbmj.AutoSize = true;
            this.lbmj.Location = new System.Drawing.Point(128, 242);
            this.lbmj.Name = "lbmj";
            this.lbmj.Size = new System.Drawing.Size(0, 12);
            this.lbmj.TabIndex = 7;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(53, 309);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 8;
            this.button1.Text = "计算";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(153, 309);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 9;
            this.button2.Text = "关闭";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(274, 373);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.lbmj);
            this.Controls.Add(this.lbzbc);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.tbbc2);
            this.Controls.Add(this.tbbc3);
            this.Controls.Add(this.tbbc1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox tbbc1;
        private System.Windows.Forms.TextBox tbbc3;
        private System.Windows.Forms.TextBox tbbc2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label lbzbc;
        private System.Windows.Forms.Label lbmj;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
    }
}

