package interfacePkg.sec01;

public interface ISmartPhone {
	//생성자가 없는 interface이므로 선언할 때 초기화 해야 함 : 상수
	//상수필드
	String name = "smartphone"; //interface 내에 있는 필드는 무조건 상수처리
	
	//구현되는 클래스의 메소드 설계도 역할
	
	//추상메소드 : body가 구현되지 않은 메소드{} 없음
	//객체가 갖고 있을 메소드를 설명하는 부분(접근제한,반환타입,메소드명,매개변수)
	public void sendCall();
	public void receiveCall();
	public void sendSMS();
	public void receiveSMS();
	
	
}
