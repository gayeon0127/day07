package list;

import java.util.ArrayList;

/*
 * collection
 * 데이터의 집합 구조 (자료구조)
 * 배열과 비슷 ; 고정 크기가 있는 []배열과 달리 공간의 크기가 유동적임 
 * 
 * framework
 * 기본 틀 
 * 
 * collection framework
 * - list ; 순서 존재, 데이터의 중복 허용
 * - map
 * - set
 */

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		// 			자료형   변수 = 객체를 만들겠다
		arr.add("1");
		arr.add("2");
		arr.add("3");
		// 데이터 추가 기능
		// 작성자가 원하는 만큼 추가 가능
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println();
		// 저장된 데이터 가져오기 
		
		System.out.println("for문으로 데이터값 가져오기");
		for(int i=0;i<3;i++) {
			System.out.println(arr.get(i));
		}
		System.out.println();
		
		System.out.println("arr.size()로 데이터값 가져오기");
		System.out.println(arr.size());
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println();
		
		System.out.println("for each문으로 데이터값 가져오기");
		for (String s : arr) {
			System.out.println(s);
		}
		System.out.println();
		
		int n1=100;
		Integer n2=200;
		System.out.println(n1+", "+n2);
		// ArrayList<int> arr02 = new ArrayList<>();
		// 대문자로 시작하는 데이터형만 넣을 수 있음
		ArrayList<Integer> arr02 = new ArrayList<>();
		// arr02.add(111.12);
		// arr02.add("1111");
		// List의 자료형과 일치하는 데이터값만 추가 가능
	}

}
