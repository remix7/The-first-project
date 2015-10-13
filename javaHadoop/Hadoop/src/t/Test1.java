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
		 //����HDFS�Ĵ���
		// ���ļ���д�ļ����鿴�б������ļ��У�ɾ���ļ����ϴ��������ļ�
		// fileSystem ������HDFS
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
	//�ϴ�
	private static void putDate() throws Exception, IOException {
		FileSystem fileSystem = getFileSystem();
		fileSystem.copyFromLocalFile(new Path("d:/h1.txt"), new Path("/d2"));
	}
//	����Ŀ¼
	private static void mkdir() throws Exception, IOException {
		FileSystem fileSystem = getFileSystem();
		fileSystem.mkdirs(new Path("/dd11"));
	}
	/**
	 * ��HDFS��  ĳ���ļ� �ļ�
	 * @throws Exception
	 */
	static void readFile() throws Exception{
		FileSystem fileSystem = getFileSystem();
		//fileSystem  �����ļ���  ��ȡHDFS�ϵ��ļ����ڴ棬���ݴ�ӡ
		//java IO֪ʶ��   open������
//		FSDataInputStream open = fileSystem.open(new Path("/d1/data1"));
		FSDataInputStream open = fileSystem.open(new Path("/hello"));
		// alt + /
		//�������������ݣ�ֱ���������׼���������̨����ʾ����
		IOUtils.copyBytes(open,System.out,1024,false);
		IOUtils.closeStream(open);		//�ر���
	}
	
	static FileSystem getFileSystem() throws Exception{
		Configuration conf = new Configuration();
		URI uri = new URI("hdfs://192.168.182.50:9000");
		FileSystem fileSystem = FileSystem.get(uri, conf);
		return fileSystem;
	}

}
