package hello.world;

public class Casting {

	public static void main(String[] args) {
		 
		 //byte 
		 
		byte b1 = 65;
		short s1 = b1;
		int i1 = b1;
		float f1 = b1;
		double d1 = b1;
		long l1= b1;
		
		//short 
		short s2 = 24328;
		int i2 = s2;
		float f2 = i2;
		
		char c1 = (char) b1;
		
		System.out.println(c1);
		System.out.println(((Object)b1).getClass().getSimpleName());
		

	}

}
