package 完成篇;



import java.net.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
public class t2 extends JFrame implements ActionListener{
	JPanel jp1=null,jp2=null,jp3=null;
	JLabel jlb=null,jlb2=null,jlb3=null,jlb4=null;//最上面放图片
	JButton jb=null;
    JTextField  jf1=null;
    JPasswordField jpf=null;
    JCheckBox  jc1=null,jc2=null;
	
  public static void main(String[] args) {
	  t2 v=new t2();
  }
  public t2(){
	  //第一个面板
	  jlb=new JLabel(new ImageIcon("完成篇/tk2.jpg"));//放置图片
	  jp1=new JPanel();
	  jp1.add(jlb);
	  //第二个面板
	  jp2=new JPanel(new GridLayout(3,3));//将面板做成三行，三列
	  jlb=new JLabel("学号",JLabel.CENTER);
	  jlb2=new JLabel("密码",JLabel.CENTER);
	  jf1=new JTextField();
	 
	  jpf=new JPasswordField();
	  jlb3=new JLabel("申请账号",JLabel.CENTER);//让申请账号，处于中间
	  jlb4=new JLabel("忘记密码",JLabel.CENTER);
	  
	  jc1=new JCheckBox("记住密码");
	  jc2=new JCheckBox("自动登录");
	 
	
	  jp2.add(jlb);
	  jp2.add(jf1);
	  jp2.add(jlb3);
	  jp2.add(jlb2);
	  jp2.add(jpf);
	  jp2.add(jlb4);
	  jp2.add(jc1);
	  jp2.add(jc2);
	  //第三张面板
	  jp3=new JPanel();
	  jb=new JButton("登录");
	  jb.addActionListener(this);
	  jb.setActionCommand("open");
	  jp3.add(jb);
	  
	  //将三个面板都放入到JFrame上
	  this.add(jp1,"North");
	  this.add(jp2,"Center");
	  this.add(jp3,"South");
	  this.setSize(500,400);
	  this.setResizable(false);
	  this.setLocation(500,400);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setTitle("芜湖职业技术学院14网络工程小游戏");
	  this.setVisible(true);
	  
  }
public void actionPerformed(ActionEvent e) {
	  int a=0;
    if(e.getActionCommand().equals("open")){
    	System.out.println("你点击了按钮");
//    	int[] a=new int[50];
//    	for(int i=1;i<50;i++){
//    		if(i<10){
//    			a[i]=1414010200+i;
//    		}else{
//    			a[i]=1414010200+i;
//    		}
//    		
//    		System.out.println(a[i]);
//    	}
    	//因为验证的时候是字符串验证
       
    	
    	if(this.jf1.getText().equals("1414010238")&&new String(this.jpf.getPassword()).equals("123")){
    		 t1 bv=new t1();
    		  System.out.println(this.jpf.getPassword());
    		  System.out.println(new String(this.jpf.getPassword()).equals("55"));//将char[] 转换成 String ------new String(char[])
    		  this.dispose();//关闭当前界面
    	}else{
    		JOptionPane.showMessageDialog(null, "你所输入的账号或密码错误"); 
    	}
    	
    	}
    	
         
    
    }
}

