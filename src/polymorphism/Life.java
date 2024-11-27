package polymorphism;

import java.util.Scanner;

public class Life extends Policy {
	private int Age;
	private int Term;
	
	public Life(String NewFirstName, String NewLastName, int NewAge, int NewTerm) {
		setFirstName(NewFirstName);
		setLastName(NewLastName);
		setAge(NewAge);
		setTerm(NewTerm);
	}
	
	@Override
	public void fromInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name of insured: ");
		setFirstName(input.next());
		System.out.print("Enter last name of insured: ");
		setLastName(input.next());
		System.out.print("Enter age of insured: ");
		setAge(Integer.valueOf(input.next()));
		System.out.print("Enter amount of term: ");
		setTerm(Integer.valueOf(input.next()));
	}
	
	public void setAge(int NewAge) {
		Age = NewAge;
	}
	
	public void setTerm(int NewTerm) {
		Term = NewTerm;
	}
	
	public int getAge() {
		return Age;
	}
	
	public int getTerm() {
		return Term;
	}
	
	@Override
	public void computeCommission() {
		setCommission(getTerm() * 0.2);
	}
	
	public String toString() {
		String ReturnStr = "Life Policy";
		ReturnStr = ReturnStr + "\n-----------";
		ReturnStr = ReturnStr + "\nName: " + getFirstName();
		ReturnStr = ReturnStr + " " + getLastName();
		ReturnStr = ReturnStr + "\nAge: " + getAge();
		ReturnStr = ReturnStr + "\nTerm: $" + getTerm();
		ReturnStr = ReturnStr + "\nCommission: $" + getCommission();
		ReturnStr = ReturnStr + "\n";
		return ReturnStr;
	}
}
