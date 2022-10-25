package exception;

public class CashPayment extends Payment{
	private String cashReceiptNumber;

	public CashPayment() {
		
	}

	public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
		super(shopName, productName, productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}
	public String toString() {
		String result = "";
		if(productPrice>0) {
			result = "현금이 정상적으로 지불되었습니다.\n"
					  + "[ 현금 결제 정보 ]\n"
					  + "상점명 : "+shopName+"\n"
					  + "상품명 : "+productName+"\n"
					  + "상품가격 : "+productPrice+"\n"
					  + "현금영수증번호 : "+cashReceiptNumber;	
		}		
	return result;
	}
	public void pay() {
		if(productPrice<=0) {
			try {
				throw new PayException("상품가격이 잘못되었습니다");
			}catch(PayException e){
				e.printStackTrace();
			}
		}
	}
	public String getCashReceiptNumber() {
		return cashReceiptNumber;
	}

	public void setCashReceiptNumber(String cashReceiptNumber) {
		this.cashReceiptNumber = cashReceiptNumber;
	}
	
}
