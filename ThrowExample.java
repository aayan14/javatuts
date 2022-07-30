package phase1.codes;

import java.io.IOException;
import java.util.Scanner;

public class ThrowExample {

	static int display (int l, int b) throws IOException{
		
		if(l>b){
			throw new IOException("l is greater than b.");
		}
		else{
			return l*b;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		try{
			int result = display(length, breadth);
			System.out.println("Area = " + result);
		}
		catch(Exception ae){
			 System.out.println("exception handled");
			 System.out.println(ae.getMessage());
		}

	}

}
