package array;
//참조형배열의 사용
public class RefArrayTest {
	public static void main(String[] args) {
		Customer obj1 = new Customer("jang", "1234", "장동건");
		Customer obj2 = new Customer("bts", "1234", "방타안");
		Customer obj3 = new Customer("lee", "1234", "이민호");
		Customer obj4 = new Customer("jang2", "1234", "장길용");
		
		System.out.println("**********고객리스트**********");
		System.out.println("아이디 :"+obj1.getId()+" 비밀번호 :"+obj1.getPass()+"성명 :"+obj1.getName());
		System.out.println("아이디 :"+obj2.getId()+" 비밀번호 :"+obj2.getPass()+"성명 :"+obj2.getName());
		System.out.println("아이디 :"+obj3.getId()+" 비밀번호 :"+obj3.getPass()+"성명 :"+obj3.getName());
		System.out.println("아이디 :"+obj4.getId()+" 비밀번호 :"+obj4.getPass()+"성명 :"+obj4.getName());
		
		System.out.println("**********고객리스트(배열)**********");
		Customer[] customerlist = new Customer[5];
		customerlist[0] = obj1;
		customerlist[1] = obj2;
		customerlist[2] = obj3;
		customerlist[3] = obj4;
		customerlist[4] = new Customer("kang","1234","강백호");
		
		for (int i = 0; i < customerlist.length; i++) {
			System.out.println("성명:"+customerlist[i].getName()+" 비밀번호:"+customerlist[i].getPass()+" 아이디:"+customerlist[i].getId());
		}
	}
}
