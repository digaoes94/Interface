package services;

public class BancoDoBrasil implements CalculatePayment {
	public double total (double amount, int installments) {
		return amount * Math.pow(1.012, installments) * (1.015 * installments);
	}
}