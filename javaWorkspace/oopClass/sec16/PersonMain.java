package oopClass.sec16;

public class PersonMain {

	public static void main(String[] args) {
		// final 필드 사용
		Person p1 = new Person("123456-1234567","계백","abc");
		
		System.out.println(p1.nation); //읽기전용필드
		System.out.println(p1.name);//일반필드
		System.out.println(p1.ssn);//읽기전용필드
		System.out.println(p1.tmp);
		
		//p1.nation = "USA"; //final 수정 불가
		p1.name = "을지문덕";
		//p1.ssn = "222222-555555";//초기화를 이미 시킴
		
	}

}
