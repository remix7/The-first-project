package test1;

import java.util.HashSet;

public class Hashset_1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Abc abc = new Abc(123,"LiBai",22);
		Abc a = new Abc(456,"LiBai",23);
		Abc b = new Abc(798,"LiBai",24);
		Abc c = new Abc(123,"LiBai",25);
//		hs.add(abc);
//		hs.add(a);
//		hs.add(b);
//		hs.add(c);
		System.out.println(abc.equals(c));
//		for (Object ob: hs) {
//			System.out.println(ob);
//		}
	}

}
class Abc extends Object{
	public int id;
	public String name;
	public int age;
	public Abc(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Abc() {}
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + id;
		return result;
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final student other = (student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public String toString() {
		return "—ß∫≈£∫"+this.id+" –’√˚£∫"+this.name+" ƒÍ¡‰£∫"+this.age;
	}
	
	
}