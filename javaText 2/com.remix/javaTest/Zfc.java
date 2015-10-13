package javaTest;

public class Zfc {
	public static void main(String[] args) {
		String a ="ABc123..;;';'.FLS789..L";
		int shuzi = 0;
		int zimu = 0;
		int qita = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)>='a'&&a.charAt(i)<='z'||a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				zimu++;
			}
			if (a.charAt(i)>='0'&&a.charAt(i)<='9') {
				shuzi++;
			}
		}
		System.out.println("×ÖÄ¸×Ö·û:"+zimu);
		System.out.println("Êý×Ö×Ö·û:"+shuzi);
		System.out.println("ÆäËû×Ö·û:"+(a.length()-zimu-shuzi));
	}
}
