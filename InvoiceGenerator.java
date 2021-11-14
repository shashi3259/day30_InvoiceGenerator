package com.bridgelab.invoice;

public class InvoiceGenerator {

	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KM = 10;
	private static final int MINIMUM_FARE = 5;

	public double calculateFare(double distance, int time) {
		return distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
	}

	public double calculateMinFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
		if(totalFare < MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalFare;
		
	}
	

}
