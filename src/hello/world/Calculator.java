package hello.world;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 
		Calculator cal = new Calculator();
		
		int a=100;
		int b=103;
		
		Scanner sc = new Scanner(System.in);
		
		arithmetic(a,b);
		
		assignment(a,b);
		
		cal.method();
		
		
		
	}
	
	private void method() {
		// TODO Auto-generated method stub
		
	}

	static void assignment(int a, int b) {
	 
		 // a = a+10; 
		System.out.println(" += "+ (a += 10));
		
		a -= 20 ;//a=a-20
		System.out.println("-= "+a);
		
		a *= 2; 
		System.out.println("*= "+a);
		
		a /= 20 ;//a=a-20
		System.out.println("/= "+a);
		
		a %= 2; 
		System.out.println("%= "+a);
		
	}

	static void arithmetic(int a, int b) {
	
		
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
