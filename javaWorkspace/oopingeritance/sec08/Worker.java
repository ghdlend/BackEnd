package oopingeritance.sec08;

public class Worker {
	private String joominNo;
	private String name;
	
	public Worker(String joominNo,String name) {
		this.joominNo = joominNo;
		this.name = name;
	}
	
	//오버라이드 유/무 -> 재정의/선언으로 달라짐
	@Override
	public String toString() {
		return "주민번호 : " + joominNo +
				"\n이름 : " + name;
	}
}
