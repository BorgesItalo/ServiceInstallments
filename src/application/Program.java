package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Contract;
import entites.Installment;
import entites_servicos.ContractService;
import entites_servicos.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter contract date");
		
		System.out.print("Number contract: ");
		Integer number = sc.nextInt();
		System.out.print("Date contract: (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("contract value: ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		int installment = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, installment);
		
		
		
		
		System.out.println("Instollments");
		
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
	}
	
	

}
