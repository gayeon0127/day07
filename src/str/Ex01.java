package str;

public class Ex01 {

	public static void main(String[] args) {
		
		String s = new String();
		// Stirng s; (=null)
		s = "anba";
		System.out.println(s);
		
		s.toUpperCase();
		// 일시적으로 변경
		// 저장하고 싶다면 s=s.toUpperCase();
		System.out.println(s);
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));

	}

}
