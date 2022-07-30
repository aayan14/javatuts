package phase1.codes;

abstract class Mnc{
	
	Mnc(){
		System.out.println("Inside MNC Constructor...");
	}
	
	abstract void mncfunc1();
	abstract void mncfunc2();
	
	void mncfunc3(){
		System.out.println("This is a normal function...");
	}
}

abstract class Infosys extends Mnc{
	void mncfunc1(){
		System.out.println("This is a mncfunc1 function from parent class running in child class...");
	}
}

class Hello extends Infosys{
	
	void mncfunc2(){
		System.out.println("This is a mncfunc2 function from parent class running in child class...");
	}
	
	void hellofunc(){
		System.out.println("This is a normal function from child class...");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Mnc a = new Hello();
		a.mncfunc1();
		a.mncfunc2();
		a.mncfunc3();
		a.hellofunc();
		

	}

}
