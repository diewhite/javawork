package logic;
public class Prob4 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
			
		for(int i = 0; i<sourceString.length(); i++) {
			 	char j = sourceString.charAt(i);
			 	if(j>96 & j<120) {
			 		int k = j+3;
				 	encodedString+=(char)k;	
			 	}else if(j==' '){
			 		int k = j;
			 		encodedString+=(char)k;
			 	}else {
			 		int k = j-23;
			 		encodedString+=(char)k;
			 	}
			 }
							
		System.out.println("암호화할 문자열 : "+sourceString);
		System.out.println("암호화된 문자열 : "+encodedString);
		
	}

}
