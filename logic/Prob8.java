package logic;
public class Prob8 {
	public static void main(String args[]) {
		
		Prob8 prob8 = new Prob8();
		
		System.out.println( prob8.leftPad("SDS", 6, '#') );
		System.out.println( prob8.leftPad("SDS", 5, '$') ); 
		System.out.println( prob8.leftPad("SDS", 2, '&') ); 
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
		String result = " ";
		if(str.length()>size) {
			result = str;
			return result;
		}else {
			for(int i = str.length(); i<size; i++) {
				result = result + padChar;
			}
			result = result + str;
			return result;
		}

		
	}
	
}
