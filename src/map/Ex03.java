package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		
		map1.put("name", "홍길동");
		map1.put("age", "20");
		map1.put("addr", "서울");
		
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		System.out.println(map1);
		
		Set<String> key_set = map1.keySet();
		Collection<String> value_co = map1.values();
		System.out.println(value_co);
		
		Iterator<String> keyIt = key_set.iterator();
		Iterator<String> valueIt = value_co.iterator();
		
		while(keyIt.hasNext()) {
			String k = keyIt.next();
			String v = valueIt.next();
			System.out.println(k+" : " + v);
		}
		
	}
}
