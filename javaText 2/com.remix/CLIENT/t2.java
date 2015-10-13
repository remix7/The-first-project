package CLIENT;
import java.io.*;

import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class t2 extends JFrame implements ActionListener,KeyListener {
	 JPanel jp1,jp2;
	 JTextArea ja;
	 JTextField jf;
	 JButton jb;
	 JScrollPane jsp;
	 static PrintWriter pw;
     public static void main(String[] args) {
    	 
    	 t2 v=new t2();
		 
    	   try {
    			  Socket s1=new Socket("",3456);
    			  //向服务器发送信息
//    				InputStreamReader isr1=new InputStreamReader(System.in);
//    				BufferedReader br1=new BufferedReader(isr1);
//    				  pw=new PrintWriter(s.getOutputStream(),true);
//    				
    				//从服务器接收信息
    				InputStreamReader isr2=new InputStreamReader(s1.getInputStream());
    				BufferedReader br2=new BufferedReader(isr2);
    		 	    pw=new PrintWriter(s1.getOutputStream(),true);
    				while(true){
//    					String info=br1.readLine();
    					//pw.println(info);
    					//显示服务器发来的信息
    					String info1=br2.readLine();
    					
    			        v.ja.append("T1    :"+info1+"\n");
    					//System.out.println("服务器发来      ："+info1);
    					
    				    
    				}
    				
    			
    		} catch (IOException e) {
    			// TODO 自动生成 catch 块
    			e.printStackTrace();
    		}
		 
	}
     public t2(){
    	 jp1=new JPanel();
    	 ja=new JTextArea(null,"",400,300);
    	
    	 jp1.add(ja);
    	 jsp=new JScrollPane(jp1);
    	 //第二块面板
    	 jf=new JTextField(20);
    	 jf.addKeyListener(this);
 
    	 jb=new JButton("发送");
    	 jb.addActionListener(this);
    	 jb.setActionCommand("send");
    	 jp2=new JPanel();
    	 jp2.add(jf);
    	 jp2.add(jb);
    	 this.add(jsp);
    	this.setTitle("T2");
    	 this.add(jp2,"South");
    	 this.setSize(400,300);
    	 this.setResizable(false);//设置窗口不能调整
    	 this.setVisible(true);
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成方法存根
		if(e.getActionCommand().equals("send")){
			String st=jf.getText();
			ja.append(st+"\n");
			jf.setText("");
			pw.println(st);
			
		}
		
	}
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成方法存根
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			String str=jf.getText();
			ja.append(str+"\n");
		     jf.setText("");
		     pw.println(str);
		}
		
	}
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成方法存根
		
	}
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成方法存根
		
	}
   
    
}