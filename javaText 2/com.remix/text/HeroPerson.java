package text;

public class HeroPerson extends Person {
	static int man;
	static String n;
	public HeroPerson(int man, String n) {
		super();
		this.man = man;
		this.n = n;
	}
	public HeroPerson() {
		super();
	}
	public static void main(String[] args) {
		HeroPerson hr = new HeroPerson();
		HeroPerson.man=4800;
		HeroPerson.n="�������ǻ���";
		for (int i = 0; i < 3; i++) {
			if (n==hr.name[i]) {
				int j =i;
				if (man==hr.mon[j]) {
					System.out.println("����������ǻ��ӳɹ�");
				}
				else{
					System.out.println("���򲻳ɹ�");
				}
			}		
		}
	}
}

