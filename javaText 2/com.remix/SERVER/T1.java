package SERVER;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class T1 extends JFrame implements ActionListener{
	JPanel jp;
	JButton jb1,jb2;
   public static void main(String[] args) {
	  T1 v=new T1();
}
   public T1(){
	   jb1=new JButton("启动服务器");
	   jb1.addActionListener(this);
	   jb1.setActionCommand("star");
	   jb2=new JButton("关闭服务器");
	   jp=new JPanel();
	   jp.setBackground(Color.PINK);
	   jp.add(jb1);
	   jp.add(jb2);
	   this.add(jp);
	   this.setSize(400,300);
	   this.setResizable(false);
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
   }
public void actionPerformed(ActionEvent e) {
	// TODO 自动生成方法存根
	if(e.getActionCommand().equals("star")){
		 try {
			
			ServerSocket ss=new ServerSocket(3456);
			 System.out.println("我是服务器，我在3456端口监听");
			Socket s=ss.accept();
			System.out.println("有客户1连接");
			Socket s1=ss.accept();
			System.out.println("有客户2连接");
		    
		    PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		    
		    PrintWriter pw1=new PrintWriter(s1.getOutputStream(),true);
			//接受客户发来的信息
			InputStreamReader isr2=new InputStreamReader(s.getInputStream());
			BufferedReader br2=new BufferedReader(isr2);
			InputStreamReader isr3=new InputStreamReader(s1.getInputStream());
			BufferedReader br3=new BufferedReader(isr3);
			while(true){
			    String sfo=br2.readLine();
			    System.out.println("1 对  2 说       ："+sfo);
			    //转发给T1
			    pw1.println(sfo);
			    String sfo1=br3.readLine();
			    System.out.println("2 对  1 说       :"+sfo1);
			    pw.println(sfo1);
			}
		} catch (IOException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		}
	}
}
}
