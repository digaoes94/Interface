package application;

import java.util.Scanner;

import entities.Financing;
import services.BancoDoBrasil;
import services.Caixa;
import services.Itau;

public class Main {
	/* System.out.println(""); */
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		double amount;
		int installments;
		String clientName, cpf;
		
		System.out.println("Vitória - Financing houses and cars since 2077!");
		System.out.println("Hello possible customer! Your name?");
		clientName = scan.nextLine();
		
		System.out.println("How much does the house costs?");
		amount = scan.nextDouble();
		scan.nextLine();
		System.out.println("How many installments would you like?");
		installments = scan.nextInt();
		scan.nextLine();
		
		Financing caixa = new Financing(amount, installments, new Caixa());
		Financing bb = new Financing(amount, installments, new BancoDoBrasil());
		Financing itau = new Financing(amount, installments, new Itau());
		
		System.out.println("Options according to banks");
		System.out.println("Caixa: " + installments + " payments of R$ " + caixa.getMonthPay() + ", making a total of R$ " + caixa.getTotal());
		System.out.println("Banco do Brasil: " + installments + " payments of R$ " + bb.getMonthPay() + ", making a total of R$ " + bb.getTotal());
		System.out.println("Itaú: " + installments + " payments of R$ " + itau.getMonthPay() + ", making a total of R$ " + itau.getTotal());
		
		scan.close();
	}
}