package verify;


public class verify01 {
	public static void main(String[] args) {
		int num = 498000;
	    int[] money = { 50000, 10000, 5000, 1000 };
	    for (int i = 0; i < money.length; i++) {
	        System.out.println(money[i]+"원: "+ num / money[i]);
	        num%= money[i];
	    }
	}
}
