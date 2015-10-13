package com.remix;

import java.util.Arrays;
import java.util.Random;

/*
 *双色红球33选6 ，篮球16选1
 *
 *要注意boolean[] redFlag = new boolean[redPool.length];  数组中的默认值是false
 * */

public class ShuangSeQiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuangSe();
	}

	public static void ShuangSe() {
		// 寻找红色球
		String[] redPool = { "01", "02", "03", "04", "05", "06", "07", "08",
				"09", "10", "11", "12", "13", "14", "15", "16", "17", "18",
				"19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
				"29", "30", "31", "32", "33" };
		boolean[] redFlag = new boolean[redPool.length];
		String[] searchRedPool = new String[6];
		int x = 0;
		while (true) {
			Random r = new Random();
			int index = r.nextInt(redPool.length);
			if (redFlag[index]) {
				continue;
			} else {
				searchRedPool[x++] = redPool[index];
				redFlag[index] = true;
			}
			if (x == 6) {
				break;
			}
		}

		// 寻找蓝色球
		int searchBluePool = new Random().nextInt(16);//利用隨機數 進行隨機挑選1-16的一個數
		String BluePool = redPool[searchBluePool];//從紅球的數組中挑選一個籃球
		Arrays.sort(searchRedPool);//對找到的紅球進行排序
		searchRedPool = Arrays.copyOf(searchRedPool, searchRedPool.length + 1);//將紅球所在的數組進行擴容+1
		searchRedPool[searchRedPool.length-1] = BluePool;//將籃球的結果放到紅球的擴容過的數組中
		// 打印结果
		
		System.out.println("红色球是：" + Arrays.toString(searchRedPool));//輸入紅球的信息
		System.out.println("绿色球是：" + "[" + BluePool + "]");//輸入籃球
		System.out.println("本次挑选的结果就是：" + Arrays.toString(searchRedPool));//輸入本次挑選的結果
	}

}
