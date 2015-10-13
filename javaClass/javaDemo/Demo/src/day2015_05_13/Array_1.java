package day2015_05_13;
/*
 * 对象数组的使用
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
			System.out.println("请输入第"+(i+1)+"只狗的名字：");
			String Name = br.readLine();
			dog[i].setName(Name);
			//dog[i].setName(new Scanner(System.in).toString());
			
			System.out.println("请输入第"+(i+1)+"只狗的体重：");
			String s_Weight =  br.readLine();
			float Weight = Float.parseFloat(s_Weight);
			dog[i].setWeight(Weight);
			//dog[i].setWeight(new Scanner(System.in).nextFloat());
		}
		//计算狗的体重和
		float all=0;
		for (int i = 0; i < dog.length; i++) {
			all+= dog[i].getWeight();
		}
		System.out.println("狗的总体重是："+all);
		System.out.println("狗的平均体重是："+all/dog.length);
		
		float maxWight = dog[0].getWeight();
		int j = 1;
		for (int i = 1; i < dog.length; i++) {
			if (maxWight<dog[i].getWeight()){
				maxWight = dog[i].getWeight();
				j++;
			}
		}
		System.out.println("狗的最大体重是："+maxWight+"  编号是："+(j)
				+"  名字是："+dog[j-1].getName());
	}

}
//定义狗的的属性
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
