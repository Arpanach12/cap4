package Savings;
import java.util.*;
public class SavingAcc {
	double balance;
	int InterestRate;
	int accountNo;
	static Scanner scanner = new Scanner(System.in);
	SavingAcc() {
		
	}
	
	public SavingAcc(int i, int j, int k) {
		this.balance=i;
		this.InterestRate=j;
		this.accountNo=k;
	}

	void withDraw(double amount)
	{
		if((balance-amount>0))
		{ 	System.out.println(amount+" Successfully withdrawn ");  balance=balance-amount ;}
		else
			System.out.println(" Insufficient balance ");
	}
	
	void calculateInterest()
	{
		System.out.println("Enter the period : ");
		int time = scanner.nextInt();
		double SI = (getBalance()*getInterestRate()*time)/100;
		System.out.println("Simple Interest : "+SI);
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(int interestRate) {
		InterestRate = interestRate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
}
