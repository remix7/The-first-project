package Demo1;

import java.util.Scanner;
//输入一个年龄判断其与18岁关系   单分支，双分支，多分支；


public class Demo1 {
	public static void main(String[] args) {
		int age;
		System.out.println("请输入一个年龄");
		Scanner ag = new Scanner(System.in);
		age = ag.nextInt();
		if(age>=18){
			System.out.println("你的年龄大于18岁，要为自己的行为负责！");
		}
		  else if(10<=age&&age<18){
			System.out.println("你的年龄不满18岁，可以不用负责！");
		}
		  else if(age<10){
			  System.out.println("你可以不用负责");
		  }

	}
}
