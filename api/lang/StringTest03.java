package api.lang;

public class StringTest03 {
	public static void main(String[] args) {
		String str1 = new String("Java programming");
		String str2 = new String("재밌다.");
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"test\")=>"+str1.startsWith("test"));
		System.out.println("str1.endsWith(\"java\")=>"+str1.endsWith("java"));
		System.out.println("str1.endsWith(\"ing\")=>"+str1.endsWith("ing"));
		System.out.println("str1.contains(\"ja\")=>"+str1.contains("ja"));
		
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());
		System.out.println(str1);
		
		System.out.println("str1.substring(5)=>"+str1.substring(5));//start index
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));//start - end - 1 (5~7)
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A'));
		System.out.println(str1);
	}
}
