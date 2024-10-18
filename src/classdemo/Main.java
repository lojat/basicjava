package classdemo;

public class Main {

	public static void main(String[] args) {
		
		Student obj = new  Student(); 
		
		obj.getCity("Bhopal");
		obj.GetName("Chanchal");
		obj.getRollNo(101);
		
	
		System.out.println("RollNo = "+obj.rollNo);
		System.out.println("Name = "+obj.name);
		System.out.println("City = "+obj.city);
		
		
		Student obj1 = new  Student(); 
		
		obj1.getCity("indore");
		obj1.GetName("Akash");
		obj1.getRollNo(102);
		
	
		System.out.println("RollNo = "+obj1.rollNo);
		System.out.println("Name = "+obj1.name);
		System.out.println("City = "+obj1.city);
		
		System.out.println("End!");
	}

}
