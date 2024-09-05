package com.pits.automationtraining.aggregation;

public class Employee {
	Car cr;//Aggregation
	Bike bk;//Aggregation
	String empName;
	int empId;
	
	public void getEmpDetails() 
	{
		cr = new Car();
		bk = new Bike();
		System.out.println("Employee Details : ");
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee ID : "+empId);
		cr.getCarInfo("Red", "Kwid", 123);
		bk.getBikeInfor("Dio", 345);
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empName = "Arjun Unnikrishnan";
		emp.empId = 3556;
		emp.getEmpDetails();

	}

}
