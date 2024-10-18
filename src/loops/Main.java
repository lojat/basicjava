package loops;

public class Main {

	public static void main(String[] args) {
		 
		/* 1.while
		 * 2. do while
		 * 3. for
		 * 4. for each
		 */
		
		/*
		 * while -
		 * 
		 * while(condition){
		 * 		 code.......
		 * 		break/increment-dicrements
		 * }
		 */
		
		int num = 10;
		int num1=1;
		
//		while(num>=num1) {
//			System.out.println(num1);//1,2,4.......10
//			num1++; //2,3,.....,11
//		}
//		
//		do {
//			System.out.println(num1);//11 ,10.......1
//			num1--;//10,.....0
//		}while(num1>0);
//		
//		//for(ins/variable ; condition ; ince/dicr){
//		//	code....
//		//}
		for(num = 10; num <= 100; num=num+5) {
			System.out.println(num);
		}

	}

}
