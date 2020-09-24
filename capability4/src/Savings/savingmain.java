package Savings;
import java.util.Scanner;
public class savingmain {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAcc sa = new SavingAcc(15500,10,123456789);
		sa.withDraw(10000);
		System.out.println("Enter the Interest rate : ");
		int interest=scanner.nextInt(); sa.setInterestRate(interest);
		sa.calculateInterest();
	}

}
