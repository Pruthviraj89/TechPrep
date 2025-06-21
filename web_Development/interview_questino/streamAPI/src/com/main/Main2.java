package com.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	
	static Comparator<Customer> temp4=(c1,c2)->{
		if(c1.joiningDate()==c2.joiningDate())
			if(c1.loyaltyLevel()==c2.loyaltyLevel())
				return c1.customerName().compareTo(c2.customerName());
		
		if(c1.joiningDate()==c2.joiningDate())
			return c1.loyaltyLevel()-c2.loyaltyLevel();
		
		
		return c1.joiningDate().compareTo(c2.joiningDate());
	};
	
	static Comparator<Customer> temp1=(c1,c2)->{
		
		if(c2.totalSpending()==c1.totalSpending())
			if(c1.loyaltyLevel()==c2.loyaltyLevel())
				return c1.joiningDate().compareTo(c2.joiningDate());
			else
				return c1.loyaltyLevel()-c2.loyaltyLevel();
			
		
		return Double.compare(c2.totalSpending(), c1.totalSpending());
	};
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<Customer> c=  List.of(
				   new Customer(101, "Alice Smith", 1200.00, 5, "2023-01-10"),
		            new Customer(102, "Bob Johnson", 300.00, 2, "2024-03-01"),
		            new Customer(103, "Charlie Brown", 5000.00, 10, "2022-05-15"),
		            new Customer(104, "Diana Prince", 90.00, 1, "2024-06-20"),

		            // Tie Scenario 1: Same Total Spending (1500.00) - Test Loyalty Level (Asc)
		            new Customer(105, "Eve Adams", 1500.00, 7, "2023-02-01"), // Higher loyalty, earlier in list
		            new Customer(106, "Frank Miller", 1500.00, 3, "2023-02-15"), // Lower loyalty, later in list

		            // Tie Scenario 2: Same Total Spending (800.00) & Loyalty Level (4) - Test Joining Date (Asc)
		            new Customer(107, "Grace Lee", 800.00, 4, "2023-04-10"), // Later date, later in list
		            new Customer(108, "Harry Wilson", 800.00, 4, "2023-03-25"), // Earlier date, earlier in list

		            // Tie Scenario 3: Same Joining Date (2024-01-01) - Test Loyalty Level (Asc)
		            new Customer(109, "Ivy Taylor", 600.00, 6, "2024-01-01"), // Higher loyalty, later in list
		            new Customer(110, "Jack White", 400.00, 2, "2024-01-01"), // Lower loyalty, earlier in list

		            // Tie Scenario 4: Same Joining Date (2024-07-01) & Loyalty Level (5) - Test Customer Name (Asc)
		            new Customer(111, "Mike Green", 700.00, 5, "2024-07-01"), // M comes after L, later in list
		            new Customer(112, "Linda Blue", 700.00, 5, "2024-07-01"), // L comes before M, earlier in list

		            // Another common one
		            new Customer(113, "Oscar Black", 200.00, 1, "2024-06-01")

	        );
		
		
		
		
		
		
	List<Customer> ct=c.stream().sorted(temp1).toList();

	

	
	List<Customer> ct2=c.stream().sorted(temp4).toList();
	
	for(Customer cus: ct) {
		
		System.out.println(cus);
	}
	
	
	System.out.println("------------------Sorted by Joining Date-------------------------");
	
		for(Customer cust: ct2) {
		
		System.out.println(cust);
	}
	
	
	
	
	
	















}}
