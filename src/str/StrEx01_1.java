package str;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class StrEx01_1 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Character> save = new LinkedHashMap<>();
		ArrayList<Character> arr = new ArrayList<>();
		
		int count=0; int a=0; int g=0;
		
		String s = new String();
		s = "It is a fun java programing";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='g') {
				if(s.charAt(i)=='a') {
					save.put(i, 'a');
				} else {
					save.put(i, 'g');
				}		
			} 	
		}
		
		Collection<Character> set = save.values();
		Iterator<Character> it = set.iterator();
		while(it.hasNext()) {
			char key = it.next();
			arr.add(key);
			if(key=='a'||key=='g') {
				count++;
			} if(key=='a') {
				a++;				
			} else {
				g++;
			}
		}

		System.out.println("총 개수 : " + count);
		System.out.println("a의 개수 : " + a);
		System.out.println("g의 개수 : " +g);

	}

}
