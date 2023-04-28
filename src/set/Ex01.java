package set;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * set
 * 순서가 존재하지 않는다.
 * 데이터의 중복 비허용
 * 배열 안의 공간을 16개로 잡고 75%가 차면 새롭게 16개의 공간을 생성함
 * 유동적 공간
 */

public class Ex01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("a");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("a");
		arr.add("b");
		arr.add("a");
		
		System.out.println("set : " + set);
		System.out.println("arr : " + arr);
		System.out.println();
		
		// set의 "b" 값 제거하기 
		set.remove("b");
		System.out.println(set);
	
	}

}



