package type.casting;

public class Explicit {

	public static void main(String[] args) {
		 
		byte b = 127;
		char c ='l';
		short s = 128;
		int i = 23599999;
		float f = 2348.8f;
		long l = 837979797;
		double d = 972379070970.0334;
		
		// sytex - datatype variable_name = (datatype) variable_name1;
		
		byte b1 = (byte) s;
		
		s = (short) i;
		
		b = (byte) f;
		
		System.out.println(b);
		
	}

}


class Class{
	
	int num = 100;
	
	public void method() {
		System.out.println(num);
	}
	
}