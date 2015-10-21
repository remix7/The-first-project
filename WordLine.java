package com.Therad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class WordLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openFile of = new openFile();
		try {
			of.getFile("D:/calc.txt", "D:/result.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class openFile {
	public void getFile(String read, String writer) throws IOException {
		try {
			//从字符流中读取文本
			BufferedReader bf = new BufferedReader(new FileReader(
					new File(read)));
			//将文本写入字符出流
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					writer)));
			String s;
			String buffered;
			while ((s = bf.readLine()) != null) {
				if (s.length() > 0) {
					if (!(s.substring(s.length() - 5).trim().equals("None"))) {
						buffered = s.substring(s.length() -30).trim();
						bw.write(buffered.substring(buffered.lastIndexOf("-")+1).trim() + "\n");
					}
				}
			}
			bw.close();
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
