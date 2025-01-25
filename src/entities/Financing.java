package entities;

import services.CalculatePayment;

public class Financing {
	
	private double amount, total, monthPay;
	private int installments;
	private CalculatePayment bank;
	
	public Financing(double amount, int installments, CalculatePayment bank) {
		this.amount = amount;
		this.installments = installments;
		this.bank = bank;
		this.total = bank.total(amount, installments);
		this.monthPay = this.total/installments;
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public double getMonthPay() {
		return monthPay;
	}
	public void setMonthPay(double monthPay) {
		this.monthPay = monthPay;
	}
}