package test01;

public class Que02 {

	public static void main(String[] args) {
		 
		int radius = 8;
		
		// store result in res variable
		double res = areaOfCircle(radius);
		
		//print res
		System.out.println("Area of Circle = "+ res);
		
	}

	//method to calculate and return area of circle
	private static double areaOfCircle(int radius) {
		 
		return 3.14*radius*radius;
		
	}

}
