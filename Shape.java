package phase1.codes;



public class Shape {

	int s;
	int l;
	int b;
	float r;
	
	Shape(){
		int th = 10;
		int tb = 20;
		float rh = 10f;
		float rb = 20f;
		this.areaTriangleRhombus(th, tb);
		this.areaTriangleRhombus(rh,rb);
	}
	Shape(int side){
		s = side;
		this.area(s);
	}
	Shape(int length, int breadth){
		l = length;
		b = breadth;
		this.area(l, b);
	}
	
	Shape(float rad){
		r = rad;
		this.area(r);
	}
	
	void areaTriangleRhombus(int h, int b){
		System.out.println("Area of triangle = " + 0.5*h*b);
	}
	
	void areaTriangleRhombus(float h, float b){
		System.out.println("Area of rhombus = " + h*b);
	}
	
	void area(int s){
		System.out.println("Area of square = " + s*s);
	}
	
	void area(int l, int b){
		System.out.println("Area of rectangle = " + l*b);
	}
	
	void area(float r){
		System.out.println("Area of circle = " + 3.14*r*r);
	}
	public static void main(String[] args) {
		
		Shape s1 = new Shape(5);
		Shape s2 = new Shape(10,20);
		Shape s3 = new Shape(7.8f);
		Shape s4 = new Shape();
		
				
		
		
	}

}
