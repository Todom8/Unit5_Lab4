package polymorphism;

import java.util.Scanner;
import java.util.ArrayList;

public class CommissionCalculator {
	ArrayList<Policy> policies = new ArrayList<Policy>();
	
	public void Run() {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("-----------------------------\n"
					+ "\n"
					+ "Welcome to Parkland Insurance\n"
					+ "\n"
					+ "-----------------------------\n"
					+ "\n"
					+ "Enter any of the following:\n"
					+ "\n"
					+ "       1) Enter auto insurance policy information\n"
					+ "\n"
					+ "       2) Enter home insurance policy information\n"
					+ "\n"
					+ "       3) Enter life insurance policy information\n"
					+ "\n"
					+ "       4) Print all sales entered\n"
					+ "\n"
					+ "       5) Quit"
					+ "\n\n");
			String selection = input.next();
			
			Policy policy = null;
			switch (selection) {
			case "1":
				policy = new Auto("", "", "", "", 0.0, 0.0);
				break;
			case "2":
				policy= new Home("", "", 0.0, 0.0, 0.0, 0.0);
				break;
			case "3":
				policy = new Life("", "", 0, 0);
				break;
			case "4":
				for(Policy list_policy : policies) {
					list_policy.computeCommission();
			        System.out.println(list_policy);
			    }
				break;
			case "5":
				return;
			default:
				break;
			}
			if (policy != null) {
				policy.fromInput();
				policies.add(policy);
			}
		}
	}
}
