package test01;

//class vehicle 
public class Vehicle {
	
	// attributes
	String modelName;
	int modelYear;
	String companyName;
	int highestSpeed;
	
	//method to get data
	public void getData(String modelName1, int modelYear1, String companyName1,int highestSpeed1) {
		modelName = modelName1;
		modelYear = modelYear1;
		companyName = companyName1;
		highestSpeed = highestSpeed1;
	}
	
	//method to display data
	public void display() {
		System.out.println("Model Name = "+modelName);
		System.out.println("Model modelYear = "+modelYear);
		System.out.println("Company Name = "+companyName);
		System.out.println("Highest Speed = "+highestSpeed);
	}

}
