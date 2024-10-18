package switch01;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {


		System.out.print("Enter a month: ");
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		switch(month) {
		
			case 1,3,5,7,8,10,12 : System.out.println(month+" have a days : "+31); break;
			case 2 : System.out.println(month+" have a days : "+28+" or "+ 29); break;
			case 4,6,9,11 : System.out.println(month+" have a days : "+30); break;
			default :System.out.println("Invalid month!");
		
		}
		
		//or 
		
		switch(month) {
		
			case 1,3,5,7,8,10,12 -> System.out.println(month+" have a days : "+31); 
			case 2 -> System.out.println(month+" have a days : "+28+" or "+ 29); 
			case 4,6,9,11 -> System.out.println(month+" have a days : "+30); 
			default -> System.out.println("Invalid month!");
	
		}

	}

}
