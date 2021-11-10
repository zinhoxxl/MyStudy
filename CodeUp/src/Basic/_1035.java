package Basic;

import java.util.Scanner;

public class _1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String a = sc.next();
	    //문자열 a -> 16진수
	    int x = Integer.valueOf(a, 16);
	    //int x -> 8진수 
	    String b = Integer.toOctalString(x);
	    System.out.println(b);
	}
}
