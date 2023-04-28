package map;

import java.util.HashMap;

/*
 * HashMap
 * 키, 값으로 이루어짐
 * 순서유지X
 * 키의 중복 미허용, 값의 중복 허용
 */

public class Ex01 {

	public static void main(String[] args) {
		
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		HashMap<String, Integer> map3 = new HashMap<>();
		
		map1.put("name", "홍길동");
		map1.put("age", "20");
		map1.put("addr", "서울");
		
		System.out.println(map1);
		System.out.println(map1.get("name"));
		
		map2.put(1, "일일일");
		map2.put(2, "이이이");
		map2.put(3, "삼삼삼");
		System.out.println(map2);
		System.out.println(map2.get(2));

	}

}
