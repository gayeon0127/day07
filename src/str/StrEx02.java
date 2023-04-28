package str;

public class StrEx02 {

	public static void main(String[] args) {
		String str ="김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
		str=str.replace("\n", " ");
		System.out.println("====변경 전 str====");
		String[] temp = str.split(" ");
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("====변경 후 str====");

	}

}
