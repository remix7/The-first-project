class TDamo {
	public static void main(String[] args) {
		String s = "     abc  abc  abc      ";
		pos(s);
		pos(myTirm(s));
	}
	
	public static void pos(Object obj){
		System.out.println(obj);
	}
	public static String myTirm(String str){
		int start = 0;
		int end = str.length()-1;
		
		while(start<=end && str.charAt(start)==' ')
			start++;
		while(start<=end && str.charAt(end)==' ')
			end--;
		return str.substring(start,end+1);
	}
	
}