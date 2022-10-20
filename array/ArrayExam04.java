package array;
public class ArrayExam04 {
	public static void main(String[] args) {
		//step1
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		int oddsum = 0;
		int evensum = 0;
	for (int i = 0; i < ia.length; i++) {
		if(ia[i]%2!=0) {
			oddsum+=ia[i];
		}else {
			evensum+=ia[i];
		}
	}
	System.out.println("(배열ia)");
	System.out.println("홀수의 합:"+oddsum);
	System.out.println("짝수의 합:"+evensum);
	
	oddsum = 0;
	evensum = 0;
	for (int i = 0; i < ib.length; i++) {
		if(ib[i]%2!=0) {
			oddsum+=ib[i];
		}else {
			evensum+=ib[i];
		}
	}
	System.out.println("(배열ib)");
	System.out.println("홀수의 합:"+oddsum);
	System.out.println("짝수의 합:"+evensum);
	System.out.println("========================");
//step2	
	
	cal(ia,"(배열ia)");
	cal(ib,"(배열ib)");
	}
	
	

	public static void cal(int[] arr,String name) {
		int oddsum = 0;
		int evensum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				oddsum+=arr[i];
			}else {
				evensum+=arr[i];
			}
		}
		System.out.println(name);
		System.out.println("홀수의 합:"+oddsum);
		System.out.println("짝수의 합:"+evensum);
	}
}
