package day2015_05_16;

public class Hanshu {
	public static void main(String[] args) {
//		dvwa(5,6);
//		getHr();
//		dvwa(10,10);
		print99();
	}
	public static void dvwa(int a,int b){
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void getHr(){
		System.out.println("------------------------");
	}
	public static void print99(){
		for (int i = 1; i <=9; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}

