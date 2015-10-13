package Demo1;

public class Demo5 {
	public static void main(String[] args) {
			
		System.out.println(jh(10,20,30));
	}
	public static int jh(int a,int b,int c){
		int max,min;
		if(a>b){
			 max = a;
			 min = b;
		}
		else{
			 max = b;
			 min = a;			
		}
		if(max<c){
			max=c;
		}
		return max + min;
	}
}
