package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestEx01 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> number = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		int choice;
		String newName,newNum = null;
		
		while(true) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print("번호를 입력하세요 : ");
			choice=scan.nextInt();
			
			switch(choice){
			case 1 :
				System.out.println("등록할 이름을 입력해주세요 : ");
				newName=scan.next();
				if(name.contains(newName)) {
					System.out.println("이미 등록된 이름입니다.");
					System.out.println("다시 입력해주세요");
					System.out.println("등록할 이름을 입력해주세요 : ");
					newName=scan.next();
				} 
				name.add(newName);
				System.out.println("등록할 번호를 입력해주세요 : ");
				newNum=scan.next();
				if(number.contains(newNum)) {
					System.out.println("이미 등록된 번호입니다.");
					System.out.println("다시 입력해주세요");
					System.out.println("등록할 번호를 입력해주세요 : ");
					newName=scan.next();
				} 
				number.add(newNum);
				
				break;
			case 2 :
				System.out.println("연락처를 확인합니다.");
				System.out.println("확인할 연락처를 입력해주세요. : ");
				newNum=scan.next();
				for(int i=0; i<number.size(); i++) {
					if(number.contains(newNum)) {
					System.out.println(number.get(i));
					System.out.println(name.get(i));
					} else {
						System.out.println("목록에 없습니다.");
					}
				}
				break;
			case 3 :
				System.out.println("삭제할 연락처를 입력하세요 : ");
				newNum = scan.next();
				for (String s : number) {
					if(s.equals(newNum)) {
						number.remove(s);
						System.out.println("해당 번호가 삭제되었습니다.");
					}
				}
				break;
			case 4 :
				System.out.println("저장된 연락처와 이름을 불러옵니다.");
				for (int i=0; i<name.size(); i++) {
					name.get(i);
					number.get(i);
				}
				break;
			case 5 :
				System.out.println("프로그램 종료");
				System.exit(1);
			}
		}
	}
}
