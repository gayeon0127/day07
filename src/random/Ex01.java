package random;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 컴퓨터 - 계산기
		 */
		
		
		System.out.println(Math.random());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			double ran = Math.random();
			arr.add((int)(ran*45)+1);
		}
		System.out.println(arr);

	}

}
