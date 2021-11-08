package Basic;

import java.util.Scanner;

public class _1027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] arr = a.split("\\.");
		System.out.printf("%s-%s-%s",arr[2],arr[1],arr[0]);
	}
}
