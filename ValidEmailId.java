package phase1.codes;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidEmailId {

	public static int searching(ArrayList<String> emailID, String searchElement){
		for(int i=0; i<emailID.size(); i++) {
            if(searchElement.equals(emailID.get(i))) {
                 return i;           
            }
        }
		return -1;
	}
	public static void main(String[] args) {
ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("abc1234@domain.com");
        emailID.add("ach.dnwioe@domain.com");
        emailID.add("lea.hoch@gmail.com");
        emailID.add("maxchamp@gmail.com");
        emailID.add("master@domain.com");
        emailID.add("aakashsingh123@gmx.com");
        
        
   
        Scanner sc = new Scanner(System.in);
        String searchElement = sc.nextLine();
        
        
        int res = searching(emailID, searchElement);
        if (res == -1){
        	System.out.println("Email ID not found in array.");
        }
        else{
        	System.out.println("Email ID found in array at position " + res);
        }

	}

}
