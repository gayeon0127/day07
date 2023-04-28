package str;

public class Ex02 {
	public static void main(String[] args) {
		int num = 1111;
		String st = num+"";
		// 숫자를 문자형으로 변환
		System.out.println(st+num);

		// int n = st; => 오류발생
		int n = Integer.parseInt(st);
		// = (int)st
		System.out.println(n+num);
		
		String st01="";
		st01 += 'a';
		st01 += 'b';
		st01 += 'c';
		System.out.println(st01);
	
	}
}
