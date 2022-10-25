package exception;

public class CardPayment extends Payment{
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;
	public CardPayment() {

	}
	public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword,
			int monthlyInstallment) {
		super(shopName, productName, productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}
	public String toString() {
		String result = "";
		if(productPrice>0 & monthlyInstallment>=0) {
			result = "신용카드가 정상적으로 지불되었습니다.\n"
					  + "[ 신용카드 결제 정보 ]\n"
					  + "상점명 : "+shopName+"\n"
					  + "상품명 : "+productName+"\n"
					  + "상품가격 : "+productPrice+"\n"
					  + "신용카드번호 : "+cardNumber;	
		}
		return result;
	}
	public void pay() {
		if(productPrice<=0 | monthlyInstallment<0) {
			try {
				throw new PayException("가격이나 할부개월수가 잘못되었습니다");
			}catch(PayException e){
				e.printStackTrace();
			}
		}
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public int getMonthlyInstallment() {
		return monthlyInstallment;
	}
	public void setMonthlyInstallment(int monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}
	
	
}
