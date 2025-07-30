package oopClass.sec15;

public class SingletonMain {

	public static void main(String[] args) {
		// singleton 패턴 클래스 사용
		//Singleton obj1 = new Singleton(); //컴파일 에러 private 사용

		//Singleton 객체가 필요한 경우 메서드 getInstance활용
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체");
		}else {
			System.out.println("다른 singleton 객체");
		}
	}

}
