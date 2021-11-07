package Basic;

import java.util.Scanner;

public class _1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x[] = new int[str.length()];
		for(int i=0;i<x.length;i++) {
			x[i] = str.charAt(i)-'0';
		}
		System.out.println("["+ x[0]*10000+"]");
		System.out.println("["+ x[1]*1000+"]");
		System.out.println("["+ x[2]*100+"]");
		System.out.println("["+ x[3]*10+"]");
		System.out.println("["+ x[4]+"]");
	}
}
