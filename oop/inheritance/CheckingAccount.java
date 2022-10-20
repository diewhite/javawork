package oop.inheritance;

public class CheckingAccount extends Account{
	private String cardNo;
	public CheckingAccount() {
	}
	public CheckingAccount(String accId, String ownerName, int balance, String cardNo) {
		super(accId, ownerName, balance);
		this.cardNo = cardNo;
	}
	public void pay(String cardNo, int amount) {
		if(this.cardNo.equals(cardNo)) {
			super.withdraw(amount);
		}else {
			System.out.println("지불이 불가능합니다.");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
