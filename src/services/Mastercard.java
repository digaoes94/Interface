package services;

public class Mastercard implements CalculatePayment {
	public double total (double amount, int installments) {
		return amount * Math.pow(1.017, installments) * (1.008 * installments);
	}
}