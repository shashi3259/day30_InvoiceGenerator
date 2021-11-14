package com.bridgelab.invoice;

import org.junit.Assert;
import org.junit.Test;



public class InvoiceGeneratorTest {
	@Test
	public void givenDistanceAndTime_GenerateTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25.0, fare, 0.0);
	}
	
	@Test 
	public void givenLessDistance_GenerateMinFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 5;
		double fare = invoiceGenerator.calculateMinFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}
	@Test
	public void givenMultipleRides_GenerateTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		invoiceGenerator.calculateTotalFare(distance, time);
		double distance = null;
		int time = null;
		Assert.assertEquals(time, distance, time);
		
	}
	

}
