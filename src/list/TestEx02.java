package list;

import java.util.Scanner;

public class TestEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lotto[] = new int[6];
		int input[] = new int[6];
		
		int count = 0;
		
		// 랜덤으로 로또 번호 추첨하기 
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for (int n=0;n<i;n++) {
				if(lotto[i]==lotto[n]) {
					i--;
					break;
				}
			}
		}
		
		// 로또번호 6개 입력받기 
		for(int i=0;i<6;i++) {
			System.out.println(i+1+"번째 숫자를 입력하세요 : ");
			input[i]=scan.nextInt();
			if(input[i]<1||input[i]>45) {
				System.out.println("1~45 사이 숫자를 입력해주세요.");
				i--;
				continue;
			}
			for(int n=0;n<i;n++) {
				if(input[i]==input[n]) {
				System.out.println("전과 같은 번호를 입력하실 수 없습니다.");
				i--;
				break;
				}
			}
		}
		
		//추첨된 로또번호와 입력한 번호 중 일치하는 갯수 세기
		for(int i=0;i<6;i++) {
			for(int n=0;n<6;n++) {
				if(lotto[i]==input[n]) {
					count++;
				}
			}
		}
		
		// 추첨 숫자와 비교한 결과 
		System.out.print("이번 주로 로또 추첨 번호는 ");
		for(int i=0;i<6; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("입니다.");
		System.out.println(count+"개 맞추셨습니다.");
		}

		
		
}



