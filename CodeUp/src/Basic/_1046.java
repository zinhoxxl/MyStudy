package Basic;

import java.util.Scanner;

public class _1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int sum = a + b + c;
	    System.out.println(sum);
	    System.out.printf("%.1f",sum/(double)3);
	}
}
