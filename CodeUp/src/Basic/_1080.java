package Basic;

import java.util.Scanner;

public class _1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0, a = 1;
		while(true) {
			result += a;
			if(result >= n) {
				System.out.println(a);
				break;
			}
			a++;
		}
	}
}