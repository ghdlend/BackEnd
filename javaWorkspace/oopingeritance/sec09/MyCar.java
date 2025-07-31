package oopingeritance.sec09;

public class MyCar { //final 사용시 상속 불가
	public int speed;
	public void speedUp() {
		speed += 1;
	}
	
	public void speedDown() {
		speed -= 1;
	}
	
	public final void stop() { //final 메서드는 sub class에서 재정의 불가능
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
