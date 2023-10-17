
package com.lulu.collections.employee_rec;
import java.util.ArrayList;
public class TeaterController {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///bucket for storing employyee Objects -- Arraylist
		ArrayList<Vehicle> bucketEmployee = new ArrayList<Vehicle>();
		System.out.println(bucketEmployee.size());
		Vehicle e1= new Vehicle("car", 234, 1);
		Vehicle e2= new Vehicle("Bike", 76457, 2);
		bucketEmployee.add(e1);
		bucketEmployee.add(e2);

		bucketEmployee.add(new Vehicle("Nagasree", 345,23));
		bucketEmployee.add(new Vehicle("Nanditha", 456,25));



		System.out.println(bucketEmployee.size());
		System.out.println("Records in the collection is ");
		System.out.println(bucketEmployee);
		System.out.println("////////*************///////////");
		for(Vehicle e : bucketEmployee) {
			System.out.println(e);
		}
	}
}

 