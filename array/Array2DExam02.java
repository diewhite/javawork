package array;

public class Array2DExam02 {

	public static void main(String[] args) {
		char [][] myarr = new char[5][5];
		for(int i=0; i<myarr.length; i++) {
			for(int j=0; j<myarr[i].length; j++) {
				if(i==j) {
					myarr[i][j] = '*';
					System.out.print(myarr[i][j]+"\t");
				}else {
					myarr[i][j] = (char)(j+(i*5)+1);
					System.out.print((int)myarr[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
}
