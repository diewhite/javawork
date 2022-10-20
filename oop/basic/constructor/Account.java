package oop.basic.constructor;

public class Account {
	String accNo;
	int balance;
	
	public Account() {
		
	}
	public void save(int balance) {
		this.balance = this.balance + balance;
		System.out.println(accNo + " 계좌에 " + balance + "만원이 입금되었습니다.");
	}
	public void deposit(int balance) {
		this.balance = this.balance - balance;
		System.out.println(accNo + " 계좌에 " + balance + "만원이 출금되었습니다.");
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccNo() {
		return accNo;
	}

	public int getBalance() {
		return balance;
	}
	
}
