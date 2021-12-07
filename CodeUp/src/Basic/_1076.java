package Basic;

import java.util.Scanner;

public class _1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		for(char ch = 97; ch <= c; ch++) {
			System.out.println(ch + " ");
		}
	} 
}