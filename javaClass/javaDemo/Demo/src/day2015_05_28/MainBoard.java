package day2015_05_28;

public class MainBoard {
	String name;
	DisPlay disPlay;
	Cache cache;
	public static void main(String[] args) {
		MainBoard mainBoard = new MainBoard();

		mainBoard.cache = new Nvidia();
		mainBoard.cache.canCache();

		mainBoard.disPlay = new Kingston();
		mainBoard.disPlay.canDisplay();
	}
	
}
