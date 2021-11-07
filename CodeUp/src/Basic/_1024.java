package Basic;

import java.util.Scanner;

public class _1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int lng = a.length();
		for(int i=0;i<lng;i++) {
			System.out.printf("\'%c\'\n",a.charAt(i));
		}
	}
}
