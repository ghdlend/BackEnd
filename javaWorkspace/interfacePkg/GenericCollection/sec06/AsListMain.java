package GenericCollection.sec06;

import java.util.*;

public class AsListMain {

	public static void main(String[] args) {
		// Arrays 클래스의 asList 메소드 : 초기화 된 List 생성
		List<String> list1 = Arrays.asList("홍길동","이몽룡","성춘향");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int no : list2) {
			System.out.println(no);
		}
		
		System.out.println();
		list2.set(1, 5);
		for(int no : list2) {
			System.out.println(no);
		}
		
		System.out.println();
		//list2.add(10); //오류 ArrayList는 오류가 아니지만 Arrays.asList는 정적인 값을 줘서 오류가 남
		for(int no : list2) {
			System.out.println(no);
		}
		
		
		
		
		
	}

}
