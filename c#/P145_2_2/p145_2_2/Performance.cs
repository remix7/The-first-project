using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p145_2_2
{
    public class Performance
    {
        private int _id;
        private string _name;
        private double _englishPerformance;
        private double _mathPerformance;
        private double _dbsPerformance;

        public int Id
        {
            get { return _id; }
            set { _id = value; }
        } 
        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }
        public double EnglishPerformance
        {
            get { return _englishPerformance; }
            set { _englishPerformance = value; }
        }
        public double MathPerformance
        {
            get { return _mathPerformance; }
            set { _mathPerformance = value; }
        }
        public double DbsPerformance
        {
            get { return _dbsPerformance; }
            set { _dbsPerformance = value; }
        }
        public Performance() { }
        public Performance(int Id, string Name, double EnglishPerformance, double MathPerformance, double DbsPerformance) 
        {
            this.Id = Id;            
            this.Name = Name;
            this.EnglishPerformance = EnglishPerformance;
            this.MathPerformance = MathPerformance;
            this.DbsPerformance = DbsPerformance;
        }
        public void Result() 
        {          
            Console.WriteLine("总分数是："+(EnglishPerformance+MathPerformance+DbsPerformance));
        }

    }
}
