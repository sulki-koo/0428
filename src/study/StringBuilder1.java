package study;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello");
		sb1.append("world");
		System.out.println(sb1.toString());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("hello");
		sb2.insert(5, " ");
		sb2.append("world");
		System.out.println(sb2.toString());
		
	}
	
}
