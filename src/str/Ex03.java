package str;

public class Ex03 {
	public static void main(String[] args) {
		
		String id="test";
		id = id.trim();
		// 문자열 양쪽의 공백 제거
		// 일회성이기 때문에 변수에 저장을 해야 함
		if(id.equals("test")) {
			System.out.println("인증통과");
		}else {
			System.out.println("인증실패");
		}
		System.out.println();
		
		String addr="우편주소;주소;상세주소";
		String[] s = addr.split(";");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println();
		
		System.out.println("addr : " +addr);
		addr = addr.replace("/", "=>");
		System.out.println("addr : " +addr);

}
}
