package phase1.codes;

public class TypeCastingEx {

	public static void main(String[] args) {
		
		//FLOAT to LONG
		float f = 3.14287f;
		long l = (long) f;
		System.out.println("Float value = " + f);
		System.out.println("Long value = " + l);

		System.out.println("------------------");
		
		//DOUBLE to LONG to INT to CHAR
		double d = 54.6879;
		long l1 = (long) d;
		int i = (int) l1;
		char c = (char) i;
		System.out.println("Double value = " + d);
		System.out.println("Long value = " + l1);
		System.out.println("Int value = " + i);
		System.out.println("Char value = " + c);
		
		System.out.println("------------------");
		
		// LONG to BYTE
		long l2 = 12349876524L;
		byte b = (byte)l;
		System.out.println("Long value = " + l2);
		System.out.println("Byte value = " + b);
		
		System.out.println("------------------");
		
		// INT to DOUBLE to LONG
		int i1 = 56;
		double d1 = (double) i1;
		long l3 = (long) d1;
		System.out.println("Int value = " + i1);
		System.out.println("Double value = " + d1);
		System.out.println("Long value = " + l3);
	}

}
