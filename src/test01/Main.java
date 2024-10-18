package test01;

public class Main {

	public static void main(String[] args) {
		 
		// first object of vehicle class
		Vehicle vehicle1 = new Vehicle();
		
		//calling getdata method to store data
		vehicle1.getData("XUV100" , 2010, "Scorpio" , 600);
		//calling display method to display data
		vehicle1.display();
		
		// object 2
        Vehicle vehicle2 = new Vehicle();
		
		vehicle2.getData("Honda City" , 2017, "Hyundai" , 500);
		vehicle2.display();
		
		
	}

}
