package wordTest;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class SetDemo {
	//下载
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
	static FileSystem getFileSystem() throws Exception{
		Configuration conf = new Configuration();
		URI uri = new URI("hdfs://192.168.182.50:9000");
		FileSystem fileSystem = FileSystem.get(uri, conf);
		return fileSystem;
	}
}
