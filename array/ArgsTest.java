package array;

public class ArgsTest {
	public static void main(String[] args) {
		/*
		 * C:\javadev>java ArgsTest 123 567 111
		 * String[] args = new String[3]
		 * args[0] = "123";
		 * args[1] = "567";
		 * args[2] = "111";
		 * 
		 * 
		 */
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	}

}
