package list;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		
		for (String s : arr) {
			if(s.equals("b")) {
				System.out.println("b와 같다.");
			}else {
				System.out.println("b와 같지 않다.");
			}
		}
		System.out.println();
		
		System.out.println("arr.contains(data)");
		System.out.println(arr.contains("b"));
		System.out.println(arr.contains("2"));
		// List 안에 특정 데이터가 존재하면 true, 그렇지 않으면 false
		boolean n = arr.contains("2");
		// Ctrl+Shift 시, 자동완성에 뜨는 자료형이 해당 함수의 데이터형
		System.out.println();
		
		System.out.println("특정데이터 삭제");
		arr.remove(1);
		arr.remove("b");
		// 해당 위치 또는 값의 데이터의 삭제
		System.out.println("삭제 후 arr: " + arr);
		
		
		
		
		
		
	}

}
