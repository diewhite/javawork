package statement;
//전체구구단출력
public class GuGuDanTest_Continue{

	public static void main(String[] args) {
		for(int row=2; row<=9; row++) {
			if(row==5) {
				continue;
			}
			for(int i=1; i<=9; i++) {
				/*
				 * if(row==5) { break; }
				 */
				System.out.print(row+"*"+i+"="+(row*i)+"\t");
			}
			System.out.println();
		}
	}

}
