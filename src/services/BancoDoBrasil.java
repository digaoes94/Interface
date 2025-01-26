package services;

public class BancoDoBrasil implements CalculatePayment {
	public double total (double amount, int installments) {
		return (0.015 * installments + 1) * amount * Math.pow(1.012, installments);
	}
}