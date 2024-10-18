package day3;

public class Methods {

	public static void main(String[] args) {
		
		/*
		 
		 1. return nothing take nothing
		 2. return something take nothing
		 3. return nothing take something
		 4. return something take something
		 
		 */
		 
		// A = 65
		// a = 97
		// byte - short - int - long 
		// char - int - float - boolean
		// long - ouble
		// float - double 
		
		byte b = 126;
		short s = b;
		
		char c = 'a';
		int i = c;
		
//		((Object)b).getClass().getSimpleName()
		
		System.out.println(((Object)b).getClass().getSimpleName());
		System.out.println(i);
		
		
		// static return methodename (parameters....){} 
//		
//		helloWorld();// method calling
//		
//		int num = returns();
//		 
//		System.out.println("Return value = "+ num  );
//		
//		parameter("World",5);
//		
//		System.out.println(sum(23,90));
		
	}
	
	static void helloWorld() {// method definition
		
		System.out.println("return nothing take nothing method call ");
		String str = "34"+25;
		System.out.println("Hello Java!"+str);
		
	}
	
	static int returns() {
		
		System.out.println("return something take nothing method call ");
		return 10;
		
	}
	
	static void parameter(String str,int x) {
		System.out.println("return nothing take something method call ");
		System.out.println("Hello "+ str+x);
	}
	
	static int sum (int a, int b) {
		return a+b;
	}
	
}
