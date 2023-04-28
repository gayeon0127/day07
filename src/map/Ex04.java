package map;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		// 순서가 있는 HashMap
		map.put("name", "홍길동");
		map.put("age", "20");
		map.put("addr", "서울");
		System.out.println(map);
		System.out.println();
		
		/*
		Set<String> set = map.keySet();
		// key값을 가져오고
		Iterator<String> it = set.iterator();
		// 가져온 키 값을 저장
		 */
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			// 다음 위치에 있는 값을 key에 대입
			System.out.println(key);
		}

	}

}
