package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		
		/*
		Iterator<String> it = arr.iterator();
		// bof ~ 데이터의 첫번째부터 n번째 값 ~ eof
		// ex) [bof, aaa, bbb, ccc, eof]
		// hasNext로 다음 위치에 값이 있는지 확인하고 next로 데이터 추가 
		// if hasNext-false가 나오면 eof(더이상 값이 없다)이기 때문에 추가할 수 없음
		// next; 다음 위치로 이동하면 값을 꺼내옴 
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		// 이 이후로 next를 쓰면 값이 없기 때문에 가져올 수 없어 error 발생
		System.out.println();
		*/
		
		/*
		// 반복문으로 해당 배열 값 추출하기
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		*/
		
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println();
	
		
		
	}
}
