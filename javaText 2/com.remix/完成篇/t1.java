package 完成篇;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.*;
public class t1 extends JFrame{
	mypanel v=null;
   public static void main(String[] args) {
	   t1 t=new t1();
}
   public  t1(){
	   v=new mypanel();
	   this.add(v);
	   Thread td=new Thread(v);
	   td.start();
	   this.addKeyListener(v);
	   this.setSize(800,800);
	   this.setTitle("李俊");
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setVisible(true);
   }
}
//设置我的坦克可以打出子弹,按下j键可以画出子弹，再然后让子弹自己往前走，而且画子弹时候有方向
class shot implements Runnable{
	int x,y;
	int dir;
	public shot(int x,int y,int dir){
		this.dir=dir;
		this.x=x;
		this.y=y;
	}
	public void run() {
		// TODO 自动生成方法存根
		while(true){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
			switch(dir){
			case 0:y--;break;
			case 1:x++;break;
			case 2:y++;break;
			case 3:x--;break;
			}
			if(x>400||x<0||y>300||y<0){
				break;
			}
			System.out.println("子弹x"+x+"子弹y"+y);
		}
	}
	
}
class hero{
	shot st=null;
	Vector<shot> sf=new Vector<shot>();
	int x,y;
	int dir;
	int speed=2;//设置坦克的移动速度
	public hero(int x,int y,int dir){
		this.x=x;
		this.y=y;
		this.dir=dir;
	}
	public void shotemny(int x,int y,int dir){
		switch(dir){
		case 0:st=new shot(x+10,y,0);sf.add(st);break;//将创建的子弹加到向量 sf.add(st);
		case 1:st=new shot(x+30,y+10,1);sf.add(st);break;
		case 2:st=new shot(x+10,y+30,2);sf.add(st);break;
		case 3:st=new shot(x,y+10,3);sf.add(st);break;
		}
		Thread te=new Thread(st);
		te.start();
	}
	
}
class emny implements Runnable{
	int x,y;
	int dir;
	int type=0;
	public emny(int x,int y,int dir){
		this.x=x;
		this.y=y;
		this.dir=dir;
	}
	//设置坦克可以自己随机移动,在指定范围里运动
	public void run() {
		while(true){
		
			
			switch(dir=(int)(Math.random()*4)){
			case 0:
				for(int i=0;i<50;i++){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();
					}
					if(y<0){
						y-=0;
					}else{
						y--;
					}
					
				}
				break;
			case 1:
				for(int i=0;i<50;i++){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();
					}
					if(x>400){
						x+=0;
					}else{
						x++;
					}
				}
				break;
			case 2:
				for(int i=0;i<50;i++){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();
					}
					if(y>300){
						y+=0;
					}
					else{
						y++;
					}
				}
			break;
			case 3:
				for(int i=0;i<50;i++){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();
					}
					if(x<0){
						x-=0;
					}
					else{
						x--;
					}
				}
				break;
			}
			System.out.println("y="+y);
		}
		
	}
	
}
class mypanel extends JPanel implements KeyListener,Runnable{
	hero hr=null;
	emny em=null;
	
	
	Vector<emny> ve=new Vector<emny>();
	public mypanel(){
		int size=50;
		hr=new hero(80,200,0);
		//画出敌人坦克
		
		for(int i=0;i<size;i++){
			em=new emny((i+1)*50,30,2);
			ve.add(em);
			Thread tr=new Thread(em);
			tr.start();
		}
	}
	public void shoutemny(){
		
	}
	 public void paint(Graphics g){
		 super.paint(g);
		 g.drawString("芜湖职业技术学院", 34, 56);
		 g.setColor(Color.GREEN);
		 g.fillRect(0,0,800,800);
		 this.drawtank(hr.x, hr.y, hr.dir, g, 0,4);
		 //初始化敌人坦克
		 for(int i=0;i<ve.size();i++){
			 this.drawtank(ve.get(i).x, ve.get(i).y, ve.get(i).dir, g,ve.get(i).type, 0);
		 }
		 if(hr.st!=null){
			 g.setColor(Color.RED);
			 g.fill3DRect(hr.st.x, hr.st.y, 2, 2,false);
		 }
		 for(int i=0;i<hr.sf.size();i++){
			 shot mu=hr.sf.get(i);//重画我的子弹
			 if(mu!=null){
				 g.fill3DRect(mu.x, mu.y, 2, 2,false);
			 }
			 
		 }
	 }
	 //画子弹
	 public void drawshot(int x,int y,int dir,Graphics g){
		 switch(dir){
		 case 0:g.fill3DRect(x+10, y, 1, 1, false);break;
		 case 1:g.fill3DRect(x+30, y+10, 1, 1, false);break;
		 case 2:g.fill3DRect(x+10, y+30, 1, 1, false);break;
		 case 3:g.fill3DRect(x, y+10, 1, 1, false);break;
		 }
	 }
	 public void drawtank(int x,int y,int dir,Graphics g,int type,int color){
			switch(color=(int)(Math.random()*5)){//color=(int)(Math.random()*5)
			case 0:g.setColor(Color.BLUE);break;
			case 1:g.setColor(Color.ORANGE);break;
			case 2:g.setColor(Color.RED);break;
			case 3:g.setColor(Color.GRAY);break;
			case 4:g.setColor(Color.PINK);break;
			}
			switch(dir){
			case 0://up 
				g.fill3DRect(x, y,5,30,false);
				g.fill3DRect(x+5, y+5, 10,20,false);
				
				g.fill3DRect(x+15, y,5,30,false);
				g.fillOval(x+6, y+11,8,8);
				g.drawLine(x+10, y, x+10, y+15);
				break;
			case 1://right
				g.fill3DRect(x, y,30,5,false);
				g.fill3DRect(x+5, y+5, 20,10,false);
				g.fill3DRect(x, y+15,30,5,false);
				g.fillOval(x+11, y+6,8,8);
				g.drawLine(x+30, y+10, x+15, y+10);
				break;
			case 2://down
				g.fill3DRect(x, y,5,30,false);
				g.fill3DRect(x+5, y+5, 10,20,false);
				g.fill3DRect(x+15, y,5,30,false);
				g.fillOval(x+6, y+11,8,8);
				g.drawLine(x+10, y+30, x+10, y+15);
				break;
			case 3://left
				g.fill3DRect(x, y,30,5,false);
				g.fill3DRect(x+5, y+5, 20,10,false);
				g.fill3DRect(x, y+15,30,5,false);
				g.fillOval(x+11, y+6,8,8);
				g.drawLine(x, y+10, x+15, y+10);
				break;
			
			}
	 }
	public void keyPressed(KeyEvent e) {
		//控制自己的坦克移动
	   if(e.getKeyCode()==KeyEvent.VK_W){
		    hr.y-=hr.speed;
		    hr.dir=0;
	   }
       else if(e.getKeyCode()==KeyEvent.VK_D){
		   hr.x+=hr.speed;
		   hr.dir=1;
	   }
       else if(e.getKeyCode()==KeyEvent.VK_S){
		   hr.y+=hr.speed;
	       hr.dir=2;
       }
       else if(e.getKeyCode()==KeyEvent.VK_A){
		   hr.x-=hr.speed;
		   hr.dir=3;
	   }
	   if(e.getKeyCode()==KeyEvent.VK_J){
		   hr.shotemny(hr.x, hr.y, hr.dir);
		 
	   }
	   this.repaint();
	}
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成方法存根
		
	}
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成方法存根
		
	}
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
			this.repaint();
		}
		
	}
}
