package phase1.codes;

import java.util.Scanner;

class SalaryReview extends Exception{
	SalaryReview(String s){
		super(s);
	}
}

public class CustomException {

	static void checkSalary (int sal) throws SalaryReview{
		if (sal < 2100){
			throw new SalaryReview("You need to work hard.");
		}
		
		else if(sal >= 2100 && sal < 5100){
			throw new SalaryReview("Your salary is somehow good.");
		}
		else{
			throw new SalaryReview("Your salary is good.");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		
		try{
			checkSalary(salary);
		}
		catch (Exception ae){
			System.out.println("exception handled");
			System.out.println(ae.getMessage());
		}
		System.out.println("Rest of the code.");

	}

}
