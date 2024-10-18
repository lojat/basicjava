package day2;

 

public class Operators {
public static void main(String[] args) {
		 
		
		int a = 0;
		int b=5;
	
	 
//		
		arithmetic(a,b);
//		
//		assignment(a,b);
		
		conditional();
		
		
		
	}
	
	private static void conditional() {
	 
		System.out.println("And && Operator");
		System.out.println("True && True = " +( true && true) );
		System.out.println("false && True = " +( false && true) );
		System.out.println("True && false = " +( true && false) );
		System.out.println("false && false = " +( false && false) );
		
		
		System.out.println("Or || Operator");
		System.out.println("True || True = " +( true || true) );
		System.out.println("false || True = " +( false || true) );
		System.out.println("True || false = " +( true || false) );
		System.out.println("false || false = " +( false || false) );
		
		
		System.out.println("Not ! Operator");
		System.out.println("! True = " +( !true) );
		System.out.println("! False  = " +( !false) );
		
		boolean res = 34<67 && 34 >12 ;
		
		System.out.println( res);
	
}

	static void assignment(int a, int b) {
	 
		 // a = a+10; 
		System.out.println(" += "+ (a/10));
		
		a -= 20 ;//a=a-20
		System.out.println("-= "+a);
		
		a *= 2; 
		System.out.println("*= "+a);
		
		a /= 20 ;//a=a-20
		System.out.println("/= "+a);
		
		a %= 2; 
		System.out.println("%= "+a);
		
	}

	static void  arithmetic(int a, int b) {
	
		
		System.out.println(a+" + "+b+" = "+ (a+b));
		System.out.println(a+" - "+b+" = "+ (a-b) );
		System.out.println(a+" + "+b+" = "+ a*b );
		System.out.println(a+" + "+b+" = "+ a/b);
		System.out.println(a+" + "+b+" = "+ a%b);
		//pre
		System.out.println(++a);//100+1=101
		System.out.println(--a);//101-1=100
		
		//post
		System.err.println(a++);//100 = 100+1
		System.out.println(a--);//101 =101-1
	
	
	
	
		
//		System.out.println("Enter the value = ");
		
//		a = sc.nextInt();
//		b = sc.nextInt();
		
	 
		
		//airthmetic operators
	 
//		
//		
//		System.out.println(a);
//		
//		
//		//assignment
//		
//		a = 100;
//		
//	
		
		//Comparison0 - == , < , > ,=<,>=
		
//		a = 10 ;
//		b=20;
//		
//		System.out.println(a<b);
//		System.out.println(a==b);
//		System.out.println(a>b);
//		System.out.println(a<=b);
//		System.out.println(a>=b);
		 
		
		
		

	}

}
