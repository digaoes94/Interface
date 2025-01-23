package entities;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Financing {
	
	private double amount;
	private int installments;
	
	public Financing(Scanner scan, DateTimeFormatter dateF, LocalDateTime loanDay, double amount, int installments) {
		this.amount = amount;
		this.installments = installments;
	}
}