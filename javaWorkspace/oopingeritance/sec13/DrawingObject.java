package oopingeritance.sec13;

public abstract class DrawingObject {
	//추상 클래스 : 추상메소드를 포함하는 클래스
	//멤버필드/멤버메소드/생성자 포함 가능
	public String penColor;
	
	//추상 메소드 draw 메소드는 subclass에서 구현해서 사용할 것
	//메소드명, 접근제한, 리턴타입은 정해주고 실제 기능은 subclass에서 구현하도록
	public abstract void draw();
}
