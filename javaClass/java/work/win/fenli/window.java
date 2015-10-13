package fenli;

	import javax.swing.JOptionPane;
	
public class window {
	public static void main(String[] args) {
		int a=0;
		int b,i,c,z=0;
		String n = JOptionPane.showInputDialog("请输入一个正整数")  ;
		int s = n.length();
		 z = Integer.parseInt(n);
		for(i=1;i<=s;i++){
			b=z%10;
			c=z/10;
			a+=b;
			z=c;			
		}
		System.out.println(a);
	}
}
