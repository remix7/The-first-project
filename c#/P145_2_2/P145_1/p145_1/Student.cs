using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_1
{
    public class Student
    {
        
        #region 定义字段
        int _studentId;
        string _name;
        string _sex;
        string _department;
        string _specialty;
        int _class;
        double _score;    
        #endregion
        
        #region 属性
        public int StudentId
        {
            get { return _studentId; }
            set { _studentId = value; }
        }
        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }
        public string Sex
        {
            get { return _sex; }
            set { _sex = value; }
        }
        public string Department
        {
            get { return _department; }
            set { _department = value; }            
        }
        public string Specialty
        {
            get { return _specialty; }
            set { _specialty = value; }
        }
        public int _class1
        {
            get { return _class; }
            set { _class = value; }
        }
        public double Score
        {
            get { return _score; }
            set { _score = value; }
        }
        #endregion

        #region 默认构造方法
        public Student() { }
        #endregion       

        #region 全属性构造方法
        public Student(int _studentId, string _name, string _sex, string _department, string _specialty, int _class, double _score) 
        {
            this._studentId = _studentId;
            this._name = _name;
            this._sex = _sex;
            this._department = _department;
            this._specialty = _specialty;
            this._class = _class;
            this._score = _score;
        }
        #endregion

        #region 输出
           public void studengShow() 
        {
            Console.WriteLine("------------------------------------");
            Console.WriteLine("学号：" +_studentId);
            Console.WriteLine("姓名：" + _name);
            Console.WriteLine("性别：" +_sex);
            Console.WriteLine("系部：" + _department);
            Console.WriteLine("专业：" + _specialty);
            Console.WriteLine("班级：" + _class);
            Console.WriteLine("总分：" + _score);
            Console.WriteLine("------------------------------------");
        }
         #endregion
       
    }
}
