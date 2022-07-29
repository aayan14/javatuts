package phase1.codes;

public class StringCompare {

	public static void main(String[] args) {
		String t= "Delhi";   
		String o = "Mumbai"; 
		String k= "delhi";   
		String y= new String ("Mumbai");    
		String l= new String ("delhi");     
		String p = new String("Hello");

		System.out.println("Is o == l: " + o == l);
		System.out.println("Is o equal to l: " + o.equals(l));
		
		System.out.println("Is y == p: " + y == p);
		System.out.println("Is y equal to p: " + y.equals(p));
		
		System.out.println("Is t == o: " + t == y);
		System.out.println("Is t equal to o: " + t.equals(o));
		
		System.out.println("Is k == y: " + k == y);
		System.out.println("Is k equal to y: " + k.equals(y));
		
		System.out.println("Is p == y: " + p == y);
		System.out.println("Is p equal to y: " + p.equals(y));
		

	}

}
