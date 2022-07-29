package phase1.codes;

public class Student {

	String n;
	int a;
	char s;
	char g;
	int m1;
	int m2;
	int m3;
	Student(String name, int age, char section, char gender, int marks1, int marks2){
		n = name;
		a = age;
		s = section;
		g = gender;
		m1 = marks1;
		m2 = marks2;
		int total = calcTotal(m1,m2,m3);
		float perc = calcPerc(total);
		this.display(n,a,s,g,total,perc);
				
			
	}
	Student(String name, int age, char section, char gender, int marks1, int marks2, int marks3){
		n = name;
		a = age;
		s = section;
		g = gender;
		m1 = marks1;
		m2 = marks2;
		m3 = marks3;
		int total = calcTotal(m1,m2,m3);
		float perc = calcPerc(total);
		this.display(n,a,s,g,total,perc);
				
			
	}
	int calcTotal(int m1,int m2,int m3){
		return m1+m2+m3;
	}
	float calcPerc(int total){
		return (total*100) / 300;
	}
	
	void display(String name, int age, char sec, char gender,int total, float perc){
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Section: "+ sec);
		System.out.println("Gender: "+ gender);
		System.out.println("Total: "+ total);
		System.out.println("Percentage: "+ perc);
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Aman", 21, 'A', 'M', 78, 79, 65);
		Student s2 = new Student("Pooja", 25, 'C', 'F', 98, 76);
		Student s3 = new Student("Roy", 24, 'B', 'M', 49, 75);
		Student s4 = new Student("Simran", 21, 'D', 'F', 78, 99, 49);
	}

}
