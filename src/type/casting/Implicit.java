package type.casting;

public abstract class Implicit {

	public static void main(String[] args) {
		 
		boolean bol = true;
		
				
		byte b = 127;
		char c ='l';
		short s = 30000;
		int i = 23599998;
		float f = 2348.8f;
		long l = 837979797;
		double d = 972379070970.0334;
		

		
//		f=d;
		
		// byte - short/char - int - float - long - double 

		d = b ;
		
		System.out.println(((Object)d).getClass().getSimpleName());
		
	}

}
