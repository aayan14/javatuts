package phase1.codes;
import java.util.Scanner;

class Calculator{
	
//	float x;
//	float y;
//	Calculator(float fo, float so){
//		x = fo;
//		y = so;
//	}
	void add(float x, float y){
		System.out.print("Result is: " + (x+y));
	}
	void subtract(float x, float y){
		System.out.print("Result is: " + (x-y));
	}
	void multiply(float x, float y){
		System.out.print("Result is: " + (x*y));
	}
	void divide(float x, float y){
		if (y != 0){
			System.out.print("Result is: " + (x/y));
		}
		else{
			System.out.print("Denominator cannot be 0");
		}
	}
}

public class ArithmaticCalc {

	public static void main(String[] args) {
		
		//ARITHMATIC CALCULATOR
		float firstOperand, secondOperand;
		char op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first operand");
		firstOperand = sc.nextFloat();
		
		System.out.println("Enter the second operand");
		secondOperand = sc.nextFloat();
		
		System.out.println("Enter the operation to be performed (+,-,*,/).");
		op= sc.next().charAt(0);
		
		Calculator calc = new Calculator();
		
		switch(op){
		case '+':
			calc.add(firstOperand, secondOperand);
			break;
			
		case '-':
			calc.subtract(firstOperand, secondOperand);
			break;
			
		case '*':
			calc.multiply(firstOperand, secondOperand);
			break;
			
		case '/':
			calc.divide(firstOperand, secondOperand);
			break;
			
		default:
			System.out.println("Please enter a valid operator.");
		}
		
	}
	
}

