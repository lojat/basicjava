package ifelse.demo;

public class IfElse {

	public static void main(String[] args) {


		/* syntax if(condition){
		 * 			 body 
		 *  	  }else{
		 *  
		 *  		body
		 *  	  }
		 */
		
		
		// 1,3,5,7,8,10,12 = 31
		//2 = 28
		//4,6,9,11 = 30
		double  num1 =20;
		double num2 = 100.9;
		double num3 =983;
		
		if(num1>num2) {// 100.9 is greater 10.9 = true
			
			if(num1>num3) {
				System.out.println("num1 is greater"+num1);
			}
			else {
				System.out.println("num3 is greater"+num3);
			}
		
			
		}else {
			if(num2>num3) {
				System.out.println("Num2 is greater"+num2);
			}
			else {
				System.out.println("num3 is greater"+num3);
			}

		} 
		
		System.out.println("End!");

	}

}
