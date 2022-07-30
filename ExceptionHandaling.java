package phase1.codes;

public class ExceptionHandaling {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;
		int total;
		
		try{
			c = a/b;
			System.out.println("Operation occured without any error");
			
		}
		catch (ArithmeticException ae){
			System.out.println(ae.getMessage());
			System.out.println("Error caught!!");
		}
		
		
		finally{
			total = a + b;
			System.out.println("Sum of a and b: " + total);
		}

	}

}
