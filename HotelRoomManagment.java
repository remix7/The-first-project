package com.remix;
/*
 * 酒店房间管理系统；
 * srarch 查询所有房间
 * init 刷新所有房间的状态
 * in 办理入住
 * out 办理退房
 * exit 退出系统
 * 
 * */
import java.util.Scanner;

public class HotelRoomManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] rooms = new String[12][10];
		System.out.println("欢迎入住1005互联网+大酒店");

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out
					.print("输入 search 查询，输入 init 初始化房间状态，输入 in 办理入住，输入 out 办理退房，输入 exit 退出系统；");
			String cmd = s.next();
			if ("search".equals(cmd)) {
				search(rooms);
			} else if ("init".equals(cmd)) {
				init(rooms);
			} else if ("in".equals(cmd)) {
				in(rooms);
			} else if ("out".equals(cmd)) {
				out(rooms);
			} else if ("exit".equals(cmd)) {
				break;
			}
		}

	}

	// 办理退房
	public static void out(String[][] rooms) {
		// System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("请输入您想要退的房间号：");
		String no = s.next();
		int no_1 = Integer.parseInt(no);
		// 判断用户输入的有没有错
		if (no.length() != 4 || no_1 > 1210) {
			System.out.print("您输入的房间号有误");
			in(rooms);
		} else {
			// 如果用户输入的第一位等于0并且第三四位小于等于9 则执行
			if (Integer.parseInt(no.substring(0, 1)) == 0
					&& Integer.parseInt(no.substring(2)) <= 9) {
				rooms[Integer.parseInt(no.substring(1, 2)) - 1][Integer
						.parseInt(no.substring(3)) - 1] = "EMPTY";
				System.out.println("办理退房成功！");
			}
			// 如果用户输入的第一位等于0并且第三四位大于9 则执行
			else if (Integer.parseInt(no.substring(0, 1)) == 0
					&& Integer.parseInt(no.substring(2)) > 9) {
				rooms[Integer.parseInt(no.substring(1, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = "EMPTY";
				System.out.println("办理退房成功！");
			}
			// 如果用户输入的第一位不等于0并且第三四位小于等于9 则执行
			else if (Integer.parseInt(no.substring(0, 1)) != 0
					&& Integer.parseInt(no.substring(2)) <= 9) {
				rooms[Integer.parseInt(no.substring(0, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = "EMPTY";
				System.out.println("办理退房成功！");
			}
			// 如果用户输入的第一位不等于0并且第三四位大于9 则执行
			else if (Integer.parseInt(no.substring(0, 1)) != 0
					&& Integer.parseInt(no.substring(2)) > 9) {
				rooms[Integer.parseInt(no.substring(0, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = "EMPTY";
				System.out.println("办理退房成功！");
			}
		}
	}

	// 选择要入住的房间
	public static void in(String[][] rooms) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("请输入您想要住的房间号：");
		String no = s.next();
		int no_1 = Integer.parseInt(no);
		// 判断用户输入的有没有错
		if ((no.length() != 4 || no_1 > 1210)|| Integer.parseInt(no.substring(2))>10 ) {
			System.out.print("您输入的房间号有误");
			in(rooms);
		} else {
			// 如果用户输入的第一位等于0并且第三四位小于等于9 则执行
			if (Integer.parseInt(no.substring(0, 1)) == 0
					&& Integer.parseInt(no.substring(2)) <= 9) {
				System.out.print("请输入您的名字：");
				rooms[Integer.parseInt(no.substring(1, 2)) - 1][Integer
						.parseInt(no.substring(3)) - 1] = new Scanner(System.in)
						.next();
				System.out.println("办理入住成功！");
			}
			// 如果用户输入的第一位等于0并且第三四位大于9 则执行
			else if (Integer.parseInt(no.substring(0, 1)) == 0
					&& Integer.parseInt(no.substring(2)) > 9) {
				System.out.print("请输入您的名字：");
				rooms[Integer.parseInt(no.substring(1, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = new Scanner(System.in)
						.next();
				System.out.println("办理入住成功！");
			}
			// 如果用户输入的第一位不等于0并且第三四位小于等于9 则执行
			else if (Integer.parseInt(no.substring(0, 1)) != 0
					&& Integer.parseInt(no.substring(2)) <= 9) {
				System.out.print("请输入您的名字：");
				rooms[Integer.parseInt(no.substring(0, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = new Scanner(System.in)
						.next();
				System.out.println("办理入住成功！");
			}
			// 如果用户输入的第一位不等于0并且第三四位大于9 则执行
			else if (Integer.parseInt(no.substring(0, 1)) != 0
					&& Integer.parseInt(no.substring(2)) > 9) {
				System.out.print("请输入您的名字：");
				rooms[Integer.parseInt(no.substring(0, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = new Scanner(System.in)
						.next();
				System.out.println("办理入住成功！");
			}
		}
	}

	// 房间查询
	public static void search(String[][] rooms) {
		// 打印房间号
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if (i < 9) {
					System.out.print("0");
				}
				int roomsNo = (i + 1) * 100 + (j + 1);
				System.out.print(roomsNo + "\t");
			}
			System.out.println();
			// 打印房间状态
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("所有房间信息打印完毕");
	}

	// 初始化所有的房间
	public static void init(String[][] rooms) {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = "EMPTY";
			}
		}
		System.out.println("房间初始化完成");
	}
}
