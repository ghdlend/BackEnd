package oopingeritance.sec09;

public class SportsCar extends MyCar{
	@Override
	public void speedUp() {
		speed += 10;
	}
//	@Override
//	public void stop() { //MyCar class에서 stop method를 final로 지정함 - @Override 불가능
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
