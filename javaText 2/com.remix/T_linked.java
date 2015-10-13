
public class T_linked {
	public static void main(String[] args) {
		LinkChild linkchild = new LinkChild();
		linkchild.setlen(9);
		linkchild.crrateLink();
		linkchild.show();
	}
}

class Child{
	int no;
	Child nextChile = null;
	public Child(int no){
		this.no=no;
	}
}
class LinkChild{
	Child firstChild = null;
	Child swap = null;
	int len = 0;
	public void setlen(int len){
		this.len=len;
	}
	public void crrateLink(){
		for(int i=1;i<=len;i++){
			if(i==1){
				Child ch = new Child(i);
				this.firstChild = ch;
				this.swap = ch;
			}else{
				if(i==len){
					Child ch = new Child(i);
					swap.nextChile = ch;
					swap.nextChile = firstChild;
				}else{
					Child ch = new Child(i);
					swap.nextChile = ch;
					swap = ch;
				}
			}
		} 
	}
	public void show(){
		Child swap = this.firstChild;
		do {
			System.out.println(swap.no);
			swap = swap.nextChile;
		} while (swap!=this.firstChild);
	}
}	


