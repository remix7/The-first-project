package test13;

import java.io.File;

public class T1 {
	public static void main(String[] args) {
		
		// File  ����������ļ���Ŀ¼
		
		File f =new File("c:/123.txt");
		//��ȡ�ļ�����Ϣ
		
		System.out.println(f.exists());
		
		System.out.println("f.getName() =" + f.getName());
		
		System.out.println("f.getAbsolutePath() =" + f.getAbsolutePath());
		
		System.out.println("f.getParent() =" + f.getParent());
		
		System.out.println("f.getPath() =" + f.getPath());
		
		//
		 
		File f2 = new File("c:\\mydir");
		
//		f2.mkdir();
		
		f2 = new File("c:/a/b/c/d");
		f2.mkdirs();
		
		
		
		
		
	}
}
