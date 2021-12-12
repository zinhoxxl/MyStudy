package Basic;

import java.util.Scanner;

public class _1086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		double b = sc.nextDouble();
		double result = (w*h*b) /8 /1024 /1024;
		System.out.printf("%.2f MB", result);
	}
}