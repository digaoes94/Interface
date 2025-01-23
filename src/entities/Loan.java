package entities;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Loan {
	private Scanner scan = new Scanner(System.in);
	private DateTimeFormatter dateF = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	private LocalDateTime loanDay = LocalDateTime.parse(scan.nextLine(), dateF);
	private double amount;
	private int installments;
	
	public Loan(Scanner scan, DateTimeFormatter dateF, LocalDateTime loanDay, double amount, int installments) {
		this.scan = scan;
		this.dateF = dateF;
		this.loanDay = loanDay;
		this.amount = amount;
		this.installments = installments;
	}
	
	
}
