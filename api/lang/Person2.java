package api.lang;
//클래스를 정의할떄 멤버변수가 있는 경우 멤버변수를 private로 선언해서 정보를 숨겨놓고
//public메소드를 통해서 접근할 수 있다.
public class Person2 {
	private String name;
	private int age;
	private String addr;
	public Person2() {
		
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	public Person2(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
	private void test() {

	}
}
