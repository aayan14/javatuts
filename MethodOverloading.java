package phase1.codes;



public class MethodOverloading {

	public int calculate(int a, int b){
		return a + b;
	}
	
	public int calculate(int r){
		return (int) 3.14*r*r;
	}
	
	public int calculate(float l, float b){
		return (int) ((int)l * b);
	}
	
	public int calculate(float s){
		return (int) ((int) s*s);
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println("Sum of 4 and 5: " + mo.calculate(4,5));
		System.out.println("Area of circle with radius 7: " + mo.calculate(7));
		System.out.println("Area of rectangle with length 6 and breadth 7: " + mo.calculate(6.0f, 7.0f));
		System.out.println("Area of square with side 7: " + mo.calculate(7f));
	}

}
