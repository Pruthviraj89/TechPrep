package com.main;

public record Customer(
		
			Integer customerId,
			String customerName,
			Double totalSpending,
			Integer loyaltyLevel,
			String joiningDate
		) {

}
