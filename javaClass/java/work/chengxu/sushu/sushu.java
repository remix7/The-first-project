package sushu;
//��1000�ڵ������������ĸ���
public class sushu {
	public static void main(String[] args) {
		int a,i,sum=0;
		for(i=1;i<=1000;i++){
			for(a=2;a<=i-1;a++){
				if(i%a==0)break;
			} if(a==i){
				System.out.println(i);
				sum++;
				System.out.println(sum);
			}			
		}
	}
}
