package com.remxi;

public class Search {

	public static String[][] searhcHotel() {
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
		return room;
	}

	public static void PrintHotelNumber(String[][] room, int value) {
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
}
