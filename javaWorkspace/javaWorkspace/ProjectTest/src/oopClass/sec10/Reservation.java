package oopClass.sec10;

public class Reservation {
	String airplane;
	String name;
	String start;
	String end;
	int price;
	String sitNum;
	
	public Reservation(String airplane,String name,String start,String end,int price,String sitNum){
		this.airplane = airplane;
		this.name = name;
		this.start = start;
		this.end = end;
		this.price = price;
		this.sitNum = sitNum;
	}
	
	public void showRsvInfo() {
		System.out.println("항공기 : "+airplane);
		System.out.println("예약자 : "+name);
		System.out.println("출발지 : "+start);
		System.out.println("도착지 : "+end);
		System.out.println("금액 : "+price);
		System.out.println("좌석번호 : "+sitNum);
	}
}
