package oopingeritance.sec07;

public class Car {
	private String carNo;
	private String carName;
	private String carMaker;
	private int carYear;
	
	public Car(String carNo,String carName,String carMaker,int carYear){
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
		this.carYear = carYear;
	}
	
	public void showCar() {
		System.out.println("차량 번호 : "+carNo);
		System.out.println("차종 : "+carName);
		System.out.println("제조사 : "+carMaker);
		System.out.println("차량 연식 : "+carYear);
	}
}
