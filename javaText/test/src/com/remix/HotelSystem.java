package com.remix;

import java.util.Scanner;

public class HotelSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入 search 查询所有房间的状态：");
		int x = input();
		while (x != -906336856) {
			System.out.print("请重新输入 search 进行查询：");
			x = input();
			if (x == -906336856) {
				break;
			}
		}
		searhcHotel(x);
		System.out.print("输入 empty 刷新房间状态：");
		x = input();
		while (x != 96634189) {
			System.out.print("请重新输入 empty 进行查询：");
			x = input();
			if (x == 96634189) {
				break;
			}
		}
		searhcHotel(x);
		System.out.println("請輸入你想要住的房間號：");
		x = input();

	}

	public static int input() {
		Scanner s = new Scanner(System.in);
		String cmd = s.next();
		int x = cmd.hashCode();
		return x;
	}

	public static void searhcHotel(int value) {
		String[][] room = new String[12][10];
		for (int i = 0; i < room.length; i++) {
			for (int j = 0; j < room[i].length; j++) {
				if (i < 9 && j != 9) {
					room[i][j] = "0" + (i + 1) + "0" + (j + 1);
				} else if (i >= 9 && j != 9) {
					room[i][j] = (i + 1) + "0" + (j + 1);
				} else if (j == 9 && i < 9) {
					room[i][j] = "0" + (i + 1) + (j + 1);
				} else {
					room[i][j] = "" + (i + 1) + (j + 1);
				}
			}
		}
		if (value == -906336856) {
			for (int i = 0; i < room.length; i++) {
				for (int j = 0; j < room[i].length; j++) {
					System.out.print(room[i][j] + " ");

				}
				System.out.println();
				for (int j = 0; j < room[i].length; j++) {
					System.out.print("empt" + " ");
				}
				System.out.println();
			}
		} else if (value == 96634189) {
			for (int i = 0; i < room.length; i++) {
				for (int j = 0; j < room[i].length; j++) {
					System.out.print(room[i][j] + " ");

				}
				System.out.println();
				for (int j = 0; j < room[i].length; j++) {
					System.out.print("null" + " ");
				}
				System.out.println();
			}
		}
	}

	public static void in(String value) {
		String x = value.substring(0, 3);
		searhcHotel(96634189);
	}

}
