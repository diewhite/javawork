package api.util;

import java.util.ArrayList;

public class ArrayListExam01 {
	public static void main(String[] args) {
		//78,88,99,100,85점을 ArrayList에 저장하고 총점과 평균 출력하기
		//배열에 저장된 데이터 -> ArrayList로 변경하기
//		ArrayList<Integer> score = new ArrayList<Integer>();
//		score.add(78);
//		score.add(88);
//		score.add(99);
//		score.add(100);
//		score.add(85);
		
		int[] arr = new int[] {78,88,99,100,85};
		ArrayList<Integer> score = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			score.add(arr[i]);
		}
		
		int total = 0;
		double avg = 0;
		
//		int size = score.size();
//		for(int i=0; i<size; i++) {
//			total = total + score.get(i);
//		}
		
		for(int data : score) {
			total+=data;
		}
		
		avg = (double)total/score.size();
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}

}
