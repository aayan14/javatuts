package phase1.codes;
import java.util.LinkedList;
import java.io.IOException;
import java.util.Scanner;

class rows{
	Scanner sc=new Scanner(System.in);
	LinkedList<String> Last=new LinkedList<String>();
	
	void row_A(String owner,char CH) throws IOException{          
		char again;
		String str;
		int prev_amt=0;
		do {
			int b=0;
		LinkedList<String> A=new LinkedList<String>();
		System.out.println("These are the selected seats in row A"+Last);
		System.out.println("How many seat you want to book:");
	
		int[] ch=new int[sc.nextInt()];
		if(ch.length<=10) {
		 System.out.println("Enter the seat number from(1-10)");
		 
		 for(int i=0;i<ch.length;i++) {
			  ch[i]=sc.nextInt();
		 }
		 for(int a: ch) {
			 if(a <=10 ) {
				 str=owner+" "+CH+a;
				 if(Last.contains(str)) {
					System.out.println("Already booked");
				 }else {
				A.add(b,str);
				b++;
				 }
			 }
			 else {
                System.out.println("invalid seat number");
			 }
		 }
		}
		 else {
			 throw new ArrayIndexOutOfBoundsException("You entered max limit");
			}
		  Last.addAll(A);
		 System.out.println("Your have selected:"+A);
		 prev_amt+=b*200;
		 System.out.println("Total amount for ticket is:"+prev_amt);
		 System.out.println("Do you want to book seat again(Y/N):");
		 again=sc.next().charAt(0);
		}
		 while(again == 'Y' || again == 'y'); 


		 
	}
		 
	void row_B(String owner,char CH){                
		char again;
		String str;
		int prev_amt=0;
			int b=0;
			do {
		LinkedList<String> B=new LinkedList<String>();
		System.out.println("How many seat you want to book:");
		System.out.println("These are the selected seats in row B"+Last);
		int[] ch=new int[sc.nextInt()];
		if(ch.length<=10) {
		 System.out.println("Enter the seat number from(1-10)");
		 
		 for(int i=0;i<ch.length;i++) {
			  ch[i]=sc.nextInt();
		 }
		 for(int a: ch) {
			 if(a <=10 ) {
				 str=owner+" "+CH+a;
				 if(Last.contains(str)) {
					System.out.println("Already booked");
				 }else {
				B.add(b,str);
				b++;
				 }
			 }
			 else {
				 System.out.println("You have entered invalid seat number");
			 }
		 }
		}
		 else {
			 throw new ArrayIndexOutOfBoundsException("You entered max limit");
			}
		 Last.addAll(B);
		 System.out.println("Your have selected:"+B);
		 prev_amt+=b*200;
		 System.out.println("Total amount for ticket is:"+prev_amt);
		 System.out.println("Do you want to book seat again(Y/N):");
		 again=sc.next().charAt(0);
			}while(again == 'Y' || again == 'y');

	}
	
	void row_C(String owner,char CH){               
		char again;
		String str;
		int prev_amt=0;
		do {
			int b=0;
		LinkedList<String> C=new LinkedList<String>();
		System.out.println("How many seat you want to book:");
		System.out.println("These are the selected seats in row_C"+Last);
		int[] ch=new int[sc.nextInt()];
		if(ch.length<=10) {
		 System.out.println("Enter the seat number from(1-10)");
		 
		 for(int i=0;i<ch.length;i++) {
			  ch[i]=sc.nextInt();
		 }
		 for(int a: ch) {
			 if(a <=10 ) {
				 str=owner+" "+CH+a;
				 if(Last.contains(str)) {
					System.out.println("Already booked");
				 }else {
				C.add(b,str);
				b++;
				 }
			 }
			 else {
				 System.out.println("You have entered invalid seat number");
			 }
		 }
		}
		 else {
			 throw new ArrayIndexOutOfBoundsException("You entered max limit");
			}
		Last.addAll(C);
		 System.out.println("Your have selected:"+C);
		 prev_amt+=b*200;
		 System.out.println("Total amount for ticket is:"+prev_amt);
		 System.out.println("Do you want to book seat again(Y/N):");
		 again=sc.next().charAt(0);
	}while(again == 'Y' || again == 'y'); 

	}
	
	void row_D(String owner,char CH){              
		char again;
		String str;
		int prev_amt=0;
		do {
			int b=0;
		LinkedList<String> D=new LinkedList<String>();
		System.out.println("How many seat you want to book:");
		System.out.println("These are the selected seats in row_D"+Last);
		int[] ch=new int[sc.nextInt()];
		if(ch.length<=10) {
		 System.out.println("Enter the seat number from(1-10)");
		 
		 for(int i=0;i<ch.length;i++) {
			  ch[i]=sc.nextInt();
		 }
		 for(int a: ch) {
			 if(a <=10 ) {
				 str=owner+" "+CH+a;
				 if(Last.contains(str)) {
					System.out.println("Already booked");
				 }else {
				D.add(b,str);
				b++;
				 }
			 }
			 else {
				 System.out.println("You have entered invalid seat number");
			 }
		 }
		}
		 else {
			 throw new ArrayIndexOutOfBoundsException("You entered max limit");
			}
		Last.addAll(D);
		 System.out.println("Your have selected:"+D);
		 prev_amt+=b*200;
		 System.out.println("Total amount for ticket is:"+prev_amt);
		 System.out.println("Do you want to book seat again(Y/N):");
		 again=sc.next().charAt(0);
	}while(again == 'Y' || again == 'y'); 

		 
	}
	
	void row_E(String owner,char CH){            
		char again;
		int prev_amt=0;
		String str;
		do {
			int b=0;
		LinkedList<String> E=new LinkedList<String>();
		System.out.println("How many seat you want to book:");
		System.out.println("These are the selected seats in row_E"+Last);
		int[] ch=new int[sc.nextInt()];
		if(ch.length<=10) {
		 System.out.println("Enter the seat number from(1-10)");
		 
		 for(int i=0;i<ch.length;i++) {
			  ch[i]=sc.nextInt();
		 }
			  for(int a: ch) {
					 if(a <=10 ) {
						 str=owner+" "+CH+a;
						 if(Last.contains(str)) {
							System.out.println("Already booked");
						 }else {
						E.add(b,str);
						b++;
						 } 
					 }
					 else {
						 System.out.println("You have entered invalid seat number");
					 }
				 }
		}
		 else {
			 throw new ArrayIndexOutOfBoundsException("You entered max limit");
			}
		Last.addAll(E);
		 System.out.println("Your have selected:"+E);
		 prev_amt+=b*200;
		 System.out.println("Total amount for ticket is:"+prev_amt);
		 System.out.println("Do you want to book seat again(Y/N):");
		 again=sc.next().charAt(0);
	}while(again == 'Y' || again == 'y'); 

	}
	
	void row_F(String owner,char CH){      
		char again;
		String str;
		int prev_amt=0;
		do {
			int b=0;
		LinkedList<String> F=new LinkedList<String>();
		System.out.println("How many seat you want to book:");
		System.out.println("These are the selected seats in row_F"+Last);
		int[] ch=new int[sc.nextInt()];
		if(ch.length<=10) {
		
		 System.out.println("Enter the seat number from(1-10)");
		 
		 for(int i=0;i<ch.length;i++) {
			  ch[i]=sc.nextInt();
		 }
		 for(int a: ch) {
			 if(a <=10 ) {
				 str=owner+" "+CH+a;
				 if(Last.contains(str)) {
					System.out.println("Already booked");
				 }else {
				F.add(b,str);
				b++;
				 }
			 }
			 else {
				 System.out.println("You have entered invalid seat number");
			 }
		 }
		}
		else {
			 throw new ArrayIndexOutOfBoundsException("You entered max limit");
		}
		Last.addAll(F);
		 System.out.println("Your have selected:"+F);
		 prev_amt+=b*200;
		 System.out.println("Total amount for ticket is:"+prev_amt);
		 System.out.println("Do you want to book seat again(Y/N):");
		 again=sc.next().charAt(0);
		}while(again == 'Y' || again == 'y'); 

	}
	
}
 class Row extends rows{
	 rows rs=new rows();
	  Scanner sc=new Scanner(System.in);
	  
	  void row(String user) {                        
			 System.out.println("Select the row (A-F):");
	         System.out.println("A. Row-A");
	         System.out.println("B. Row-B");
	         System.out.println("C. Row-C");
	         System.out.println("D. Row-D");
	         System.out.println("E. Row-E");
	         System.out.println("F. Row-F");
	        
	        String st=sc.next().toUpperCase();
	        char ch=st.charAt(0);  //  
	        System.out.println("Your have selected Row-"+ch);
	        seat_upd(ch,user);
	   
		 } 
	  
	  void seat_upd(char ch,String user) {
			 switch(ch) {                             
			 case 'A':
				 try {
				 rs.row_A(user,ch);
				 }catch(Exception e) {e.getMessage();}
				 break;
			 case 'B':
				 try {
					 rs.row_B(user,ch);
					 }catch(Exception e) {e.getMessage();}
				 break;
			 case'C':
				 try {
					 rs.row_C(user,ch);
					 }catch(Exception e) {e.getMessage();}
				 break;
			 case 'D':
				 try {
					 rs.row_D(user,ch);
					 }catch(Exception e) {e.getMessage();}
				 break;
			 case 'E':
				 try {
					 rs.row_E(user,ch);
					 }catch(Exception e) {e.getMessage();}
				 break;
			 case 'F':
				 try {
					 rs.row_F(user,ch);
					 }catch(Exception e) {e.getMessage();}
				 break;
				 
		     default:
			     System.out.println("Entered invalid value");
			     row(user);
			     break;
			 }
	  }	  
	  
  }
 
public class MovieTicket extends Row{
	
		    Scanner sc=new Scanner(System.in);
	 
	 protected void update() {  
			System.out.println("Enter your Old password:");
 		String old=sc.nextLine();
 		System.out.println("Enter your New password:");
 		String ne=sc.nextLine();
	}
	 
	 
	 
	 
	 void booking(String user){   
		 
         System.out.println("Select the show time:");
         System.out.println("1. 9am-12pm");
         System.out.println("2. 1pm-4pm");
         System.out.println("3. 5pm-8pm");
         System.out.println("4. 9pm-12pm");
         System.out.println("5. 1am-4am");
         System.out.println("6. 5am-8am");
        int ch=sc.nextInt();
		 switch(ch) {
		 case 1:
			 System.out.println("Your selected time is 9am-12pm");
			 row(user);
			 break;
		 case 2:
			 System.out.println("Your selected time is 1pm-4pm");
			 row(user);
			 break;
		 case 3:
			 System.out.println("Your selected time is 5pm-8pm");
			 row(user);
			 break;
		 case 4:
			 System.out.println("Your selected time is 9pm-12pm");
			 row(user);
			 break;
		 case 5:
			 System.out.println("Your selected time is 1am-4am");
			 row(user);
			 break;
		 case 6:
			 System.out.println("Your selected time is 5am-8am");
			 row(user);
			 break;
			 
	     default:
		     System.out.println("Entered invalid value");
		     break;
		 }
	 }
	
	public static void main(String[] args) {
		
		MovieTicket bt=new MovieTicket();
		Scanner sc=new Scanner(System.in);
	
		LinkedList<String> li=new LinkedList<String>();
		 
	    li.add("sachin@gma.com");
	    li.add("leonard@yah.com");
	    li.add("nikhil@out.com");
	    
	    
	    System.out.println("Are you a user or Admin?(Y/N)");
	    String str=sc.nextLine();

	    if(str.charAt(0)=='Y' || str.charAt(0)=='y') {
	    	
	       	System.out.println("Enter your user name and password:");
			String user=sc.nextLine();
			
	 if(li.contains(user)) {     
       		System.out.println("Do you want to upadte password?(Y/N)");
       		String upt=sc.nextLine();
       		if(upt.charAt(0)=='Y' || upt.charAt(0)=='y') {
       			bt.update();
       		}
       		else {
       			bt.booking(user);
       		}
       	}
       }else {
    	   System.out.println("Your not allowed do actions");
       }
			
	    sc.close();
	    
	}

}