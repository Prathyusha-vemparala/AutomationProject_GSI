
import java.util.Scanner;



public class FirstProject {



	@SuppressWarnings("resource")

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);

		int maths=scanner.nextInt();

		int science=scanner.nextInt();

		int english=scanner.nextInt();

		

		if(maths<35 || science<35 || english<35) {

			System.out.println("Failed due to low score in at least one subject");

		}

		

		double average=(maths+science+english)/3;

		if(average>=90) {

			System.out.println("A+ Excellent performance");

		}

		else if(average>=75) {

			System.out.println("A Grade Excellent performance");

		}

		else if(average>=60) {

			System.out.println("B Grade Keep improving");

		}

		else if(average>=40) {

			System.out.println("C Grade Keep improving");

		}

		else {

			System.out.println("FAILED please work harder next time");

		}

		



	}



}
