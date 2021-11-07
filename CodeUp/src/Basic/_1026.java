package Basic;

import java.util.Scanner;

public class _1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = sc.next();
		String[] a = arr.split("\\:");
		int b = Integer.parseInt(a[1]);
		System.out.printf("%d", b);
	}
}
