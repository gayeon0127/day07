package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TestEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int choice;
		
		HashMap<String, Integer> menu = new HashMap<>();
		String name=null; 
		int cost=0;
		
		while(true) {
			System.out.println("=================");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.println("=================");
			System.out.print("번호를 입력하세요 : ");
			choice=scan.nextInt();
			
			switch(choice){
			case 1 :
				System.out.println("등록할 메뉴룰 아래 입력하세요.");
				name=scan.next();
				System.out.println("등록할 메뉴의 가격을 아래 입력해주세요.");
				cost=scan.nextInt();
				menu.put(name, cost);
				System.out.println("메뉴가 등록되었습니다.");
				break;
			case 2 :
				System.out.println("메뉴별 가격을 확인합니다.");
				System.out.println(menu);
				System.out.println();
				System.out.println("-----------------");
				System.out.println("1.수정  2.삭제 3.나기기");
				System.out.println("-----------------");
				System.out.print("선택해주세요 >>> ");
				int num = scan.nextInt();
					switch(num) {
					case 1 :
						System.out.println("수정할 메뉴를 입력해주세요.");
						name=scan.next();
						if (menu.containsKey(name)) {
							System.out.println("수정할 메뉴의 가격을 입력해주세요.");
							cost=scan.nextInt();
							menu.put(name, cost);
							System.out.println("메뉴가 수정되었습니다.");
							System.out.println(menu);
						} else {
							System.out.println("없는 메뉴입니다.");
						}
						break;
					case 2 :
						System.out.println("삭제할 메뉴를 입력해주세요.");
						name=scan.next();
						if (menu.containsKey(name)) {
							menu.remove(name);
							System.out.println("삭제되었습니다.");
							System.out.println(menu);
						} else {
							System.out.println("없는 메뉴입니다.");
						}
						break;
					case 3 :
						System.out.println("메뉴별 가격 확인을 종료합니다.");
						break;	
					}
					break;
			case 3 :
				System.out.println("프로그램 종료");
				System.exit(1);
			}	
		}

	}
}
