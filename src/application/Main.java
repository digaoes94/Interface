package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	/* System.out.println(""); */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter dateF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime loanDay;
		
		double amount;
		int installments;
		
		System.out.println("Vitória - Financing houses and cars since 2077!");
		System.out.println("How much does the house costs?");
		amount = scan.nextDouble();
		scan.nextLine();
		System.out.println("How mmany installments would you like?");
		installments = scan.nextInt();
		scan.nextLine();
		
		loanDay = LocalDateTime.now();
	}
}