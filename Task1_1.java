package main;

public class Task1_1 {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		if(n==0) {
			return 0;
		}
	return (int) (n*Math.pow(-1, n+1))+getSn1(n-1);
	}
	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		if(n==0) {
			return 0;
		}
	return getSn2Help(n)+getSn2(n-1);
	}
	
	public static int getSn2Help(int n) {
		if(n==0) {
			return 1;
		}
		return  n*getSn2Help(n-1);
	}
	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		if(n==0) {
			return 0;
		}
	return (int) (Math.pow(n, 2)+getSn3(n-1));
	}
	// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	public static double getSn4(int n) {
		if(n<0) {
			return 0;
		}
	return (1/getSn4Help(n)) + getSn4(n-1);
	}
	
	public static double getSn4Help(int n) {
		if(n==0) {
			return 1;
		}
	  return 2*n*getSn4Help(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(getSn1(7));
		System.out.println(getSn2(7));
		System.out.println(getSn3(7));
		System.out.println(getSn4(7));
	}
}

