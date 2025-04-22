package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	
	public static void main(String[] args) {
		
		String email = "abc123@gmail.com";
//		String email2 = "abc123@gmail";
		Pattern pattern = Pattern.compile("\\w+@(\\w+\\.\\w+)+");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			System.out.println("유효한 이메일");
		} else {
			System.out.println("이메일주소가 유효하지 않습니다.");
		}
		
		String str7 = "a,b,c,d,e";
		String[] arr = str7.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
		
		
	}

}
