package services;

public class PicPay implements CalculatePayment {
	public double total (double amount, int installments) {
		return amount * Math.pow(1.018, installments) * (1.012 * installments);
	}
}