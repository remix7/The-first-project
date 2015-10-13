package t;

import java.io.IOException;
import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class Test1 {
	public static void main(String[] args) throws Exception {
		 //访问HDFS的代码
		// 读文件，写文件，查看列表，创建文件夹，删除文件，上传，下载文件
		// fileSystem 来访问HDFS
//		Configuration conf = new Configuration();
//		URI uri = new URI("hdfs://192.168.182.50:9000");
//		readFile();
//		mkdir();
//		putDate();
		
//		getDate();
		
	}
	private static void getDate() throws Exception, IOException {
		FileSystem fileSystem = getFileSystem();
		fileSystem.copyToLocalFile(new Path("/d2/h1.txt"), new Path("e:/"));
	}
	//上传
	private static void putDate() throws Exception, IOException {
		FileSystem fileSystem = getFileSystem();
		fileSystem.copyFromLocalFile(new Path("d:/h1.txt"), new Path("/d2"));
	}
//	创建目录
	private static void mkdir() throws Exception, IOException {
		FileSystem fileSystem = getFileSystem();
		fileSystem.mkdirs(new Path("/dd11"));
	}
	/**
	 * 读HDFS上  某个文件 文件
	 * @throws Exception
	 */
	static void readFile() throws Exception{
		FileSystem fileSystem = getFileSystem();
		//fileSystem  来读文件：  读取HDFS上的文件到内存，内容打印
		//java IO知识；   open输入流
//		FSDataInputStream open = fileSystem.open(new Path("/d1/data1"));
		FSDataInputStream open = fileSystem.open(new Path("/hello"));
		// alt + /
		//从输入流读数据，直接输出到标准输出（控制台，显示器）
		IOUtils.copyBytes(open,System.out,1024,false);
		IOUtils.closeStream(open);		//关闭流
	}
	
	static FileSystem getFileSystem() throws Exception{
		Configuration conf = new Configuration();
		URI uri = new URI("hdfs://192.168.182.50:9000");
		FileSystem fileSystem = FileSystem.get(uri, conf);
		return fileSystem;
	}

}
