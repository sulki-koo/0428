package study.math;

public class Math1 {
	
	public static void main(String[] args) {
		
		int a = 10; 
		int b = 20;
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		System.out.println("최대값 : " + max);
		System.out.println("최값 : " + min);
		
		int num = -5;
		int abs = Math.abs(num);
		System.out.println("절댓값 : " + abs);
		
		double degree = 45.0;
		double radian = Math.toRadians(degree);
		double sinValue = Math.sin(radian);
		double cosValue = Math.cos(radian);
		System.out.println("sin(" + degree + "): " + sinValue);
		System.out.println("sin(" + degree + "): " + cosValue);
		
		double base = 2.0;
		double exponent = 3.0;
		double powValue = Math.pow(base, exponent);
		double logValue = Math.log10(powValue);
		System.out.println(base + "의 " + "제곱: " + powValue);
		System.out.println("log10(" + powValue + "): " + logValue);
		
	}
	
}
