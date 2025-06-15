package firstpackage;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int initial=12321;
		int digit;
		int reverse=0;
		int num=initial;
		while(num!=0) {
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		if(initial==reverse) {
			System.out.println(initial+" is a palindrome");
		}
		else {
			System.out.println(initial+" is not a palindrome");
		}
	}

}
