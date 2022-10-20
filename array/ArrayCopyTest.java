package array;

public class ArrayCopyTest {

	public static void main(String[] args) {
		//원본배열
		int[] srcArr = {10, 20, 30, 40, 50};

		//대상배열
		int[] dstArr = new int[10];
		
		//복사전
		for(int i=0; i<dstArr.length;i++) {
			System.out.print(dstArr[i]+" ");
		}
		System.out.println();

		//배열복사
		System.arraycopy(srcArr, 0, dstArr, 0, srcArr.length);
		for(int i=0; i<dstArr.length;i++) {
			System.out.print(dstArr[i]+" ");
		}

	}

}
