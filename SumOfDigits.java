package firstpackage;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=534;
		int sum=0;
		int digit=0;
		
		while(number!=0) {
			digit=number%10;
			number=number/10;
			sum=sum+digit;
		}

		System.out.println(sum);
	}

}
