package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F1 {
	public static void main(String[] args) throws IOException {
//		File f= new File("e:\\abc.txt");
//		System.out.println(f.exists());
//		System.out.println(f.getName());
//		System.out.println(f.getParent());
//		System.out.println(f.getPath());
//		System.out.println(f.getAbsolutePath());
		FileReader fr = new FileReader("e:\\abc.txt");
		BufferedReader bf = new BufferedReader(fr);
		String readLine;
		while((readLine = bf.readLine())!=null){
			System.out.println(readLine);
		}
		FileWriter fw = new FileWriter("e:\\12345.txt");
		BufferedWriter bf1 = new BufferedWriter(fw);
		
		bf1.write(123);
	}
}
