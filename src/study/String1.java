package study;

public class String1 {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "world";
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같다.");
		} else {
			System.out.println("str1과 str2는 다르다.");
		}
		
		String str3 = "안녕";
		String str4 = "하세요";
		String str5 = str3 + str4;
		System.out.println(str5);
		
		String str6 = "hello world";
		String[] arr = str6.split(" ");
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
	
}
