package Basic;

import java.util.Scanner;

public class _1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = sc.nextDouble();
		
		double result = (h*b*c*s) /8 /1024 /1024;
		System.out.printf("%.1f MB", result);
       
	}
}