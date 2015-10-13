namespace p63
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.tbczs1 = new System.Windows.Forms.TextBox();
            this.tbczs2 = new System.Windows.Forms.TextBox();
            this.tbjg = new System.Windows.Forms.TextBox();
            this.cbysf = new System.Windows.Forms.ComboBox();
            this.btnjs = new System.Windows.Forms.Button();
            this.btnqc = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(21, 40);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(47, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "操作数1";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(21, 102);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(47, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "操作数2";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(21, 70);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(41, 12);
            this.label3.TabIndex = 2;
            this.label3.Text = "运算符";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(21, 145);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(29, 12);
            this.label4.TabIndex = 3;
            this.label4.Text = "结果";
            // 
            // tbczs1
            // 
            this.tbczs1.Location = new System.Drawing.Point(86, 40);
            this.tbczs1.Name = "tbczs1";
            this.tbczs1.Size = new System.Drawing.Size(100, 21);
            this.tbczs1.TabIndex = 4;
            // 
            // tbczs2
            // 
            this.tbczs2.Location = new System.Drawing.Point(86, 102);
            this.tbczs2.Name = "tbczs2";
            this.tbczs2.Size = new System.Drawing.Size(100, 21);
            this.tbczs2.TabIndex = 5;
            // 
            // tbjg
            // 
            this.tbjg.Enabled = false;
            this.tbjg.Location = new System.Drawing.Point(86, 139);
            this.tbjg.Name = "tbjg";
            this.tbjg.Size = new System.Drawing.Size(100, 21);
            this.tbjg.TabIndex = 6;
            // 
            // cbysf
            // 
            this.cbysf.FormattingEnabled = true;
            this.cbysf.Items.AddRange(new object[] {
            "+",
            "-",
            "*",
            "/"});
            this.cbysf.Location = new System.Drawing.Point(86, 70);
            this.cbysf.Name = "cbysf";
            this.cbysf.Size = new System.Drawing.Size(100, 20);
            this.cbysf.TabIndex = 7;
            // 
            // btnjs
            // 
            this.btnjs.Location = new System.Drawing.Point(23, 183);
            this.btnjs.Name = "btnjs";
            this.btnjs.Size = new System.Drawing.Size(75, 23);
            this.btnjs.TabIndex = 8;
            this.btnjs.Text = "计算";
            this.btnjs.UseVisualStyleBackColor = true;
            this.btnjs.Click += new System.EventHandler(this.btnjs_Click);
            // 
            // btnqc
            // 
            this.btnqc.Location = new System.Drawing.Point(111, 183);
            this.btnqc.Name = "btnqc";
            this.btnqc.Size = new System.Drawing.Size(75, 23);
            this.btnqc.TabIndex = 9;
            this.btnqc.Text = "清除";
            this.btnqc.UseVisualStyleBackColor = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(213, 230);
            this.Controls.Add(this.btnqc);
            this.Controls.Add(this.btnjs);
            this.Controls.Add(this.cbysf);
            this.Controls.Add(this.tbjg);
            this.Controls.Add(this.tbczs2);
            this.Controls.Add(this.tbczs1);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox tbczs1;
        private System.Windows.Forms.TextBox tbczs2;
        private System.Windows.Forms.TextBox tbjg;
        private System.Windows.Forms.ComboBox cbysf;
        private System.Windows.Forms.Button btnjs;
        private System.Windows.Forms.Button btnqc;
    }
}

