package com.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class T1 {

	public static void main(String[] args) throws IOException {
		FileReader read = new FileReader("E:/abc.txt");
		FileWriter Writer=new FileWriter("E:/Result.txt");
		BufferedReader br = new BufferedReader(read);
		String row;
		int z=0;
		
		while((row=br.readLine())!=null){
			int a = row.indexOf("	");
			String b = row.substring(a, row.length()).trim();
			int sum = Integer.parseInt(b);
			z+=sum;
//			
//			System.out.println(row+" "+row.length()+" "+a+" "+row.substring(0,a).trim()+" "+
//					row.substring(a, row.length()).trim()+" "+z);
			System.out.println(row.substring(0,a).trim()+" "
					+row.substring(a, row.length()).trim()+" "+z);
			Writer.write(row.substring(0,a).trim()+" "+row.substring(a, row.length()).trim()+"    "+z+"\r\n");
		}
		System.out.println(z);
	}
}
