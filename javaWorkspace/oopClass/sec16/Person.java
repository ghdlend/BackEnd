package oopClass.sec16;

public class Person {
	//final : 초기화 되면 수정할 수 없는 필드
	//final의 초기화는 클래스내에서 진행되어야 함
	//일반 final 멤버변수 : 인스턴스 별로 다른 값을 가질 수 있음
	final String nation = "Korea"; //고정값으로 초기화
	String name;
	final String ssn; //초기값 인스턴스 생성될 때 부여
	final String tmp;
	
	public Person(String ssn,String name,String tmp) {
		this.ssn = ssn;
		this.name = name;
		this.tmp = tmp;
	}
}
