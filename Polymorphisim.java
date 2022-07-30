package phase1.codes;

class Area{
	void areaCalc(float l, float b){
		System.out.println("Area is: " + l*b);
	}
}

class Rectangle extends Area{
	void areaCalc(float l1, float b1){
		System.out.println("Area of Rectangle is: " + l1*b1);
	}
}

class Square extends Area{
	void areaCalc(float s1, float s2){
		System.out.println("Area of Square is: " + s1*s2);
	}
}

class Triangle extends Area{
	void areaCalc(float h1, float b2){
		System.out.println("Area of Triangle is: " + 0.5*h1*b2);
	}
}

class Rhombus extends Area{
	void areaCalc(float d1, float d2){
		System.out.println("Area of Rhombus is: " + d1*d2);
	}
}
public class Polymorphisim {

	public static void main(String[] args) {
		
		Area a1;
		
		a1 = new Rectangle();
		a1.areaCalc(4f, 3f);
		
		a1 = new Square();
		a1.areaCalc(4f, 4f);
		
		a1 = new Triangle();
		a1.areaCalc(4f, 3f);
		
		a1 = new Rhombus();
		a1.areaCalc(4f, 3f);
		
		

	}

}
