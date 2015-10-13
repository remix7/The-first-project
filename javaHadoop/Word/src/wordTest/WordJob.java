package wordTest;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordJob {
	
		private static String Input_Path = "hdfs://192.168.182.111:9000/input";
		private static String Out_Path = "hdfs://192.168.182.111:9000/output";

		public static void main(String[] args) throws Exception {
			Configuration configuration = new Configuration();
			Job job = new Job(configuration,"Word-job");
			
			job.setMapperClass(WordMapper.class);
			job.setMapOutputKeyClass(Text.class);
			job.setMapOutputValueClass(IntWritable.class);
			
			 
			job.setReducerClass(WordReducer.class);
			job.setOutputKeyClass(Text.class);
			job.setOutputValueClass(IntWritable.class);
			
			FileInputFormat.addInputPath(job,new Path(Input_Path ));
			
			FileOutputFormat.setOutputPath(job, new Path(Out_Path ));
			
			job.waitForCompletion(true);
			
			
			
			
		}
}
