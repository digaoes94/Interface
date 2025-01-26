package services;

public class Caixa implements CalculatePayment {
	public double total (double amount, int installments) {
		return (0.01 * installments + 1) * amount * Math.pow(1.008, installments);
	}
}