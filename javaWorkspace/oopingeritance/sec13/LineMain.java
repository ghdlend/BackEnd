package oopingeritance.sec13;

public class LineMain {

	public static void main(String[] args) {
		// Line 클래스 사용
		Line line = new Line();
		line.draw();
		
		//추상클래스 객체 생성 불가
		//DrawingObject dot = new DrawingObject(); //추상클래스여서 객체 생성 불가능
		
		//Circle 클래스 사용
		Circle circle = new Circle();
		circle.draw();
		
		//Rect 클래스 사용
		Rect rect = new Rect();
		rect.draw();
		
		
	}

}
