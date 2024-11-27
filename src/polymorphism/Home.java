package polymorphism;

import java.util.Scanner;

public class Home extends Policy {
	private double Footage;
	private double Dwelling;
	private double Contents;
	
	public Home(String NewFirstName, String NewLastName, double NewFootage, double NewDwelling, double NewContents, double NewLiability) {
		setFirstName(NewFirstName);
		setLastName(NewLastName);
		setFootage(NewFootage);
		setDwelling(NewDwelling);
		setContents(NewContents);
		setLiability(NewLiability);
	}
	
	@Override
	public void fromInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name of insured: ");
		setFirstName(input.next());
		System.out.print("Enter last name of insured: ");
		setLastName(input.next());
		System.out.print("Enter house square footage: ");
		setFootage(Double.valueOf(input.next()));
		System.out.print("Enter amount of dwelling: ");
		setDwelling(Double.valueOf(input.next()));
		System.out.print("Enter amount of contents: $");
		setContents(Double.valueOf(input.next()));
		System.out.print("Enter amount of liability: $");
		setLiability(Double.valueOf(input.next()));
	}
	
	public void setFootage(double NewFootage) {
		Footage = NewFootage;
	}
	
	public void setDwelling(double NewDwelling) {
		Dwelling = NewDwelling;
	}
	
	public void setContents(double NewContents) {
		Contents = NewContents;
	}
	
	public double getFootage() {
		return Footage;
	}
	
	public double getDwelling() {
		return Dwelling;
	}
	
	public double getContents() {
		return Contents;
	}
	
	@Override
	public void computeCommission() {
		setCommission((getLiability() * 0.3) + ((getDwelling() + getContents()) * 0.2));
	}
	
	public String toString() {
		String ReturnStr = "Home Policy";
		ReturnStr = ReturnStr + "\n-----------";
		ReturnStr = ReturnStr + "\nName: " + getFirstName();
		ReturnStr = ReturnStr + " " + getLastName();
		ReturnStr = ReturnStr + "\nFootage: " + getFootage();
		ReturnStr = ReturnStr + "\nDwelling: $" + getDwelling();
		ReturnStr = ReturnStr + "\nContents: $" + getContents();
		ReturnStr = ReturnStr + "\nLiability: $" + getLiability();
		ReturnStr = ReturnStr + "\nCommission: $" + getCommission();
		ReturnStr = ReturnStr + "\n";
		return ReturnStr;
	}
}
