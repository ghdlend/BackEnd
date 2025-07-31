package oopingeritance.sec13;

public class Circle extends DrawingObject{

	public Circle() {
		penColor = "blue"; //DrawingObject의 필드 penColor가 public이므로 바로 접근 가능
	}
	
	@Override
	public void draw() {
		// 추상 메소드 구현
		System.out.println(penColor + "색상으로 원 그리기");
		
	}

}
