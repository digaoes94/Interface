package services;

public class Visa implements CalculatePayment {
	public double total (double amount, int installments) {
		return amount * Math.pow(1.015, installments) * (1.01 * installments);
	}
}