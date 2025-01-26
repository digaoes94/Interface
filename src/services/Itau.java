package services;

public class Itau implements CalculatePayment {
	public double total (double amount, int installments) {
		return (0.013 * installments + 1) * amount * Math.pow(1.018, installments);
	}
}