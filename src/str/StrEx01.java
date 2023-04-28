package str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class StrEx01 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Character> save = new LinkedHashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
		
		String s = new String();
	
		s = "Have a nice day Have a nice day Have a nice day";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a') {
				save.put(i, 'a');
			}
		}
		Iterator<Integer> it = save.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			arr.add(key);
		}
		System.out.println(arr);
	}
}