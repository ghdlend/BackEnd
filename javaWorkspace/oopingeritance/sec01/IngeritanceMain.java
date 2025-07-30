package oopingeritance.sec01;

public class IngeritanceMain {

	public static void main(String[] args) {
		// Parent를 상속받은 child 클래스 사용
		Child ob = new Child(); //Child 클래스 인스턴스도 생성하지만 Parent 클래스 인스턴스도 생성되어야 함
		
		ob.setChild(); //Child 클래스 메서드
		//Child 클래스 인스턴스 통해 부모 클래스 메서드 호출
		ob.setParent();
		ob.showChild();//클래스 내부 코드에 부모 클래스 메서드 호출하고 있음 
		ob.showParent(); //부모 클래스 호출 가능
		
		Parent pa = new Parent();
		pa.showParent();
		// pa.showChild(); //자식 클래스 메서드 접근 불가
	}

}
