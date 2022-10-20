package oop.practice1;
public class BookMgr{
	Book[] booklist = new Book[5];
	public BookMgr() {
		
	}
	public BookMgr(Book[] booklist) {
		for(int i = 0; i<booklist.length; i++) {
			this.booklist[i] = booklist[i];	
		}
				
	}
	
	public void printBooklist(){
		for(int i = 0; i<booklist.length; i++) {
			System.out.println(booklist[i].getTitle());			
		}
		
	}
	
	public void printTotalPrice(){
		int result = 0;
		for(int i = 0; i<booklist.length; i++) {
			result = result + booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+result);
	}
}
