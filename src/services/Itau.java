package services;

public class Itau implements CalculatePayment {
	public double total (double amount, int installments) {
		return amount * Math.pow(1.018, installments) * (1.013 * installments);
	}
}