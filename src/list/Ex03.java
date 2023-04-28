package list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		System.out.println(arr.indexOf("b"));
		System.out.println(arr.indexOf("b2"));
		System.out.println();
		
		System.out.println(arr);
		arr.remove("b");
		arr.add("b");
		// 일반적으로 삭제 후 데이터 추가 시 마지막에 추가됨
		arr.add(1,"홍길동");
		// 데이터의 위치를 지정하면 해당 위치로 추가됨
		arr.set(1, "김개똥");
		// arr.remove+add
		System.out.println(arr);
		System.out.println();
		
	}

}
