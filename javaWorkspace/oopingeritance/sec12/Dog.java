package oopingeritance.sec12;

public class Dog extends Animal{
	@Override
	public void show() {
		System.out.println("강아지입니다.");
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	//Dog 클래스에서 선언한 메소드
	public void dogMethod() {
		System.out.println("dogMethod 입니다.");
	}
}
