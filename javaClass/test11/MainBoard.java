package test11;

public class MainBoard {
	//主板
	String name;	//品牌
	//安装内存，显卡，需要定义2个接口
	Cache  cache = new Kingston();   //成员变量：内存接口
	Display display;  // 显卡接口
	public static void main(String[] args) {
		MainBoard mainBoard = new MainBoard();
		mainBoard.cache.canCache();
		
		mainBoard.cache = new Meiguang();
		
		mainBoard.cache.canCache();
		//
	}
}
