package day2015_05_13;
/*
 * ���������ʹ��
 */
import java.io.*;
//import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) throws IOException {
		Dog dog[] = new Dog[4];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for (int i = 0; i < dog.length; i++) {
			dog[i]=new Dog();
			System.out.println("�������"+(i+1)+"ֻ�������֣�");
			String Name = br.readLine();
			dog[i].setName(Name);
			//dog[i].setName(new Scanner(System.in).toString());
			
			System.out.println("�������"+(i+1)+"ֻ�������أ�");
			String s_Weight =  br.readLine();
			float Weight = Float.parseFloat(s_Weight);
			dog[i].setWeight(Weight);
			//dog[i].setWeight(new Scanner(System.in).nextFloat());
		}
		//���㹷�����غ�
		float all=0;
		for (int i = 0; i < dog.length; i++) {
			all+= dog[i].getWeight();
		}
		System.out.println("�����������ǣ�"+all);
		System.out.println("����ƽ�������ǣ�"+all/dog.length);
		
		float maxWight = dog[0].getWeight();
		int j = 1;
		for (int i = 1; i < dog.length; i++) {
			if (maxWight<dog[i].getWeight()){
				maxWight = dog[i].getWeight();
				j++;
			}
		}
		System.out.println("������������ǣ�"+maxWight+"  ����ǣ�"+(j)
				+"  �����ǣ�"+dog[j-1].getName());
	}

}
//���幷�ĵ�����
class Dog{
	private String name;
	private float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float wight) {
		this.weight = wight;
	}
	
}

/*
class jiSuan{
	private String name;
	private float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float wight) {
		this.weight = wight;
	}
	
	
}	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
