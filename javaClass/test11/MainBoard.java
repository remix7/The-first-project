package test11;

public class MainBoard {
	//����
	String name;	//Ʒ��
	//��װ�ڴ棬�Կ�����Ҫ����2���ӿ�
	Cache  cache = new Kingston();   //��Ա�������ڴ�ӿ�
	Display display;  // �Կ��ӿ�
	public static void main(String[] args) {
		MainBoard mainBoard = new MainBoard();
		mainBoard.cache.canCache();
		
		mainBoard.cache = new Meiguang();
		
		mainBoard.cache.canCache();
		//
	}
}
