package oopClass.sec14;

public class StaticBlock {
	//static 블록 - static 멤버만 모아놓은 영격, 모든 static 멤버가 영역에 무조건 있어야 하는건 아님
	//인스턴스 필드와 메서드
	int a;
	void method() {};
	
	static int staticA;
	static void staticMethod() {};
	
	//static 블록
	static {
		int b = 1;
		//method() {}; //인스턴스 메서드 사용 불가
		staticA = 10;
		staticMethod();
	}
	
	{//인스턴스 필드는 대부분 생성자를 통해서 초기화가 이루어짐 초기화 블록 사용 x
		int a1 = 10;
		int b1 = 50;
	}
	
	static { //static 필드의 선언과 초기화는 static block을 이용함 - 클래스가 메서드 영역으로 로딩될 때 자동으로 실행하는 block
		int c = 0;
		double bc = 5.0;
	}
	
	static void staticMethod2() {
		//static 메서드는 this 사용 불가
		//this.a = 2;
		//객체를 생성하고 인스턴스로 접근하는건 가능
		StaticBlock s = new StaticBlock();
		s.a = 200;
		s.method();
		
	}
	
	
}
