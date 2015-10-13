package com.handoop;
import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class had_1 {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		URI uri = new URI("hdfs://192.168.233.116:9000");
		FileSystem fileSystem = FileSystem.get(uri,conf);
		FSDataInputStream open = fileSystem.open(new Path("/d/data"));
		IOUtils.copyBytes(open, System.out,1024, false);
		IOUtils.closeStream(open);
		
	}
	
}
static FileSystme getFileSystem(){
	Configuration conf = new Configuration();
	URI uri = new URI("hdfs://192.168.182.50:9000");
	FileSystem fileSystem = FileSystem.get(uri, conf);
	return fileSystem;
}
