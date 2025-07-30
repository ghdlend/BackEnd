package oopingeritance.sec07;

public class CarAutomobile {

	public static void main(String[] args) {
		Car c = new Car("01가1234","아반떼","현대",2022);
		
		//객체 생성하면서 생성자에게 값 전달
		c.showCar();
	}

}
