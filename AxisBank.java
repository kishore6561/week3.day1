package week3.day1;

public class AxisBank extends BankInfo{
	void deposit()
	{
		System.out.println("deposit 25000 in account");
	}

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();
	}

}
