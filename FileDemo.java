package phase1.codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileDemo {

	static void write(String path) throws IOException{
		FileWriter content = new FileWriter(path);	
		content.write("This content is written in the file.");
		content.close();
		System.out.println("Successfully wrote to the file.");
	}
	
	static void write(String path, boolean t) throws IOException{
		FileWriter content = new FileWriter(path, t);	
		content.write("This content is written in the file.");
		content.close();
		System.out.println("Successfully wrote to the file.");
	}
	
	static void read(String path, File file) throws FileNotFoundException{
		Scanner myReader = new Scanner(file);
	    while (myReader.hasNextLine()) {
	        System.out.println(myReader.nextLine());
	      }
		
	}
	public static void main(String[] args) throws IOException {
		String path = "C://Users//HP//Desktop//Mphasis Java//phase1//src//phase1//codes//filedemocontent.txt";
		File file = new File(path);
		file.createNewFile();

		write(path);
		read(path, file);
		write(path, true);
		read(path,file);
		
//	    FileWriter contents = new FileWriter("C://Users//HP//Desktop//Mphasis Java//phase1//src//phase1//codes//filedemocontent.txt");
//	    contents.append("This section is appended.");
//	    contents.close();
//	    
//	    
//	    while (myReader.hasNextLine()) {
//	        System.out.println(myReader.nextLine());
//	      }
//		
	}

}
