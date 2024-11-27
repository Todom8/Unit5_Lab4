package polymorphism;

import java.util.Scanner;

public class Auto extends Policy {
	private String Make;
	private String Model;
	private double Collision;
	
	public Auto(String NewFirstName, String NewLastName, String NewMake, String NewModel, double NewLiability, double NewCollision) {
		setFirstName(NewFirstName);
		setLastName(NewLastName);
		setMake(NewMake);
		setModel(NewModel);
		setLiability(NewLiability);
		setCollision(NewCollision);
	}
	
	@Override
	public void fromInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name of insured: ");
		setFirstName(input.next());
		System.out.print("Enter last name of insured: ");
		setLastName(input.next());
		System.out.print("Enter make of vehicle: ");
		setMake(input.next());
		System.out.print("Enter model of vehicle: ");
		setModel(input.next());
		System.out.print("Enter amount of liability: $");
		setLiability(Double.valueOf(input.next()));
		System.out.print("Enter amount of collision: $");
		setCollision(Double.valueOf(input.next()));
	}
	
	public void setMake(String NewMake) {
		Make = NewMake;
	}
	
	public void setModel(String NewModel) {
		Model = NewModel;
	}
	
	public void setCollision(double NewCollision) {
		Collision = NewCollision;
	}
	
	public String getMake() {
		return Make;
	}
	
	public String getModel() {
		return Model;
	}
	
	public double getCollision() {
		return Collision;
	}
	
	@Override
	public void computeCommission() {
		setCommission((getLiability() + getCollision()) * 0.3);
		
	}
	
	public String toString() {
		String ReturnStr = "Auto Policy";
		ReturnStr = ReturnStr + "\n-----------";
		ReturnStr = ReturnStr + "\nName: " + getFirstName();
		ReturnStr = ReturnStr + " " + getLastName();
		ReturnStr = ReturnStr + "\nMake: " + getMake();
		ReturnStr = ReturnStr + "\nModel: " + getModel();
		ReturnStr = ReturnStr + "\nLiability: $" + getLiability();
		ReturnStr = ReturnStr + "\nCollision: $" + getCollision();
		ReturnStr = ReturnStr + "\nCommission: $" + getCommission();
		ReturnStr = ReturnStr + "\n";
		return ReturnStr;
	}
}
