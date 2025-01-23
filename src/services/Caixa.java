package services;

public class Caixa implements CalculatePayment {
	public double total (double amount, int installments) {
		return amount * Math.pow(1.008, installments) * (1.01 * installments);
	}
}