package oop.inheritance;

public class Account {
	private String accId;
	private int balance;
	private String ownerName;
	public Account() {
	}
	
	public Account(String accId, String ownerName, int balance) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	public void deposit(long amount) {
		this.balance = (int)amount + this.balance;
	}
	public void withdraw(long amount) {
		if(this.balance>(int)amount) {
			this.balance = this.balance-(int)amount;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	public void balanceCheck() {
		System.out.println("현재잔액===>"+this.balance);
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
