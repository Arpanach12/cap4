package xyzbank;

public class bank {
	int custID;
	String custName;
	String custAddress;
	String accType;
	double custBalance;
	public bank() {
		
	}
	
	public bank(int i, String string, String string2) {
		this.custID=i;
		this.custName=string;
		this.custAddress=string2;
	}
	public bank(int i, String string) {
		this.custID=i;
		this.custName=string;
	}
	public bank(int i, String string, String string2, String string3, double j) {
		this.custID=i;
		this.custName=string;
		this.custAddress=string2;
		this.accType=string3;
		this.custBalance=j;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getCustBalance() {
		return custBalance;
	}
	public void setCustBalance(double custBalance) {
		this.custBalance = custBalance;
	}

	public void print() {
		System.out.println("Customer ID : "+getCustID());
		System.out.println("Customer Name : "+getCustName());
		System.out.println("Customer Address : "+getCustAddress());
		System.out.println("Customer Account Type : "+getAccType());
		System.out.println("Customer balance : "+getCustBalance());
	}
}
