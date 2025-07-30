package oopingeritance.sec06;

public class Computer extends Calculator {
	//컴파일러는 부모 클래스의 areaCircle 메소드의 정의부와 재정의되는 메소드의 정의부가 같은지 확인
	@Override
	double areaCircle(double r) { //default 사용
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI * r * r; // 좀 더 정밀한 계산을 위한 3.141592대신 PI사용
	}
}
