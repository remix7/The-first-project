package com.remix;
/*
 * �Ƶ귿�����ϵͳ��
 * srarch ��ѯ���з���
 * init ˢ�����з����״̬
 * in ������ס
 * out �����˷�
 * exit �˳�ϵͳ
 * 
 * */
import java.util.Scanner;

public class HotelRoomManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] rooms = new String[12][10];
		System.out.println("��ӭ��ס1005������+��Ƶ�");

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out
					.print("���� search ��ѯ������ init ��ʼ������״̬������ in ������ס������ out �����˷������� exit �˳�ϵͳ��");
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

	// �����˷�
	public static void out(String[][] rooms) {
		// System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("����������Ҫ�˵ķ���ţ�");
		String no = s.next();
		int no_1 = Integer.parseInt(no);
		// �ж��û��������û�д�
		if (no.length() != 4 || no_1 > 1210) {
			System.out.print("������ķ��������");
			in(rooms);
		} else {
			// ����û�����ĵ�һλ����0���ҵ�����λС�ڵ���9 ��ִ��
			if (Integer.parseInt(no.substring(0, 1)) == 0
					&& Integer.parseInt(no.substring(2)) <= 9) {
				rooms[Integer.parseInt(no.substring(1, 2)) - 1][Integer
						.parseInt(no.substring(3)) - 1] = "EMPTY";
				System.out.println("�����˷��ɹ���");
			}
			// ����û�����ĵ�һλ����0���ҵ�����λ����9 ��ִ��
			else if (Integer.parseInt(no.substring(0, 1)) == 0
					&& Integer.parseInt(no.substring(2)) > 9) {
				rooms[Integer.parseInt(no.substring(1, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = "EMPTY";
				System.out.println("�����˷��ɹ���");
			}
			// ����û�����ĵ�һλ������0���ҵ�����λС�ڵ���9 ��ִ��
			else if (Integer.parseInt(no.substring(0, 1)) != 0
					&& Integer.parseInt(no.substring(2)) <= 9) {
				rooms[Integer.parseInt(no.substring(0, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = "EMPTY";
				System.out.println("�����˷��ɹ���");
			}
			// ����û�����ĵ�һλ������0���ҵ�����λ����9 ��ִ��
			else if (Integer.parseInt(no.substring(0, 1)) != 0
					&& Integer.parseInt(no.substring(2)) > 9) {
				rooms[Integer.parseInt(no.substring(0, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = "EMPTY";
				System.out.println("�����˷��ɹ���");
			}
		}
	}

	// ѡ��Ҫ��ס�ķ���
	public static void in(String[][] rooms) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("����������Ҫס�ķ���ţ�");
		String no = s.next();
		int no_1 = Integer.parseInt(no);
		// �ж��û��������û�д�
		if ((no.length() != 4 || no_1 > 1210)|| Integer.parseInt(no.substring(2))>10 ) {
			System.out.print("������ķ��������");
			in(rooms);
		} else {
			// ����û�����ĵ�һλ����0���ҵ�����λС�ڵ���9 ��ִ��
			if (Integer.parseInt(no.substring(0, 1)) == 0
					&& Integer.parseInt(no.substring(2)) <= 9) {
				System.out.print("�������������֣�");
				rooms[Integer.parseInt(no.substring(1, 2)) - 1][Integer
						.parseInt(no.substring(3)) - 1] = new Scanner(System.in)
						.next();
				System.out.println("������ס�ɹ���");
			}
			// ����û�����ĵ�һλ����0���ҵ�����λ����9 ��ִ��
			else if (Integer.parseInt(no.substring(0, 1)) == 0
					&& Integer.parseInt(no.substring(2)) > 9) {
				System.out.print("�������������֣�");
				rooms[Integer.parseInt(no.substring(1, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = new Scanner(System.in)
						.next();
				System.out.println("������ס�ɹ���");
			}
			// ����û�����ĵ�һλ������0���ҵ�����λС�ڵ���9 ��ִ��
			else if (Integer.parseInt(no.substring(0, 1)) != 0
					&& Integer.parseInt(no.substring(2)) <= 9) {
				System.out.print("�������������֣�");
				rooms[Integer.parseInt(no.substring(0, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = new Scanner(System.in)
						.next();
				System.out.println("������ס�ɹ���");
			}
			// ����û�����ĵ�һλ������0���ҵ�����λ����9 ��ִ��
			else if (Integer.parseInt(no.substring(0, 1)) != 0
					&& Integer.parseInt(no.substring(2)) > 9) {
				System.out.print("�������������֣�");
				rooms[Integer.parseInt(no.substring(0, 2)) - 1][Integer
						.parseInt(no.substring(2)) - 1] = new Scanner(System.in)
						.next();
				System.out.println("������ס�ɹ���");
			}
		}
	}

	// �����ѯ
	public static void search(String[][] rooms) {
		// ��ӡ�����
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if (i < 9) {
					System.out.print("0");
				}
				int roomsNo = (i + 1) * 100 + (j + 1);
				System.out.print(roomsNo + "\t");
			}
			System.out.println();
			// ��ӡ����״̬
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("���з�����Ϣ��ӡ���");
	}

	// ��ʼ�����еķ���
	public static void init(String[][] rooms) {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = "EMPTY";
			}
		}
		System.out.println("�����ʼ�����");
	}
}
