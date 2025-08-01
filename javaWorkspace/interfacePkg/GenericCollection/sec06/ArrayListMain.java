package GenericCollection.sec06;
import java.util.ArrayList;
public class ArrayListMain {

	public static void main(String[] args) {
		// ArrayList 콜렉션 : 제네릭 타입이 아닌 경우
		ArrayList list = new ArrayList();
		
		// 리스트 항목 추가 : add(매개변수 e) -> ArrayList 마지막에 추가
		list.add(100);
		list.add("홍길동");
		list.add(7.7f);
		list.add("홍길동"); //값 중복 가능
		
		//리스트 전체 내용 출력 : 입력된 순서대로 0번 인덱스부터 출력됨
		//순서를 보장하는 콜렉션
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 리스트 항목 추가2 : add(idx,e) -> ArrayList에 항목추가 매개변수로 전달된 idx 위치에 추가
		list.add(0,"변경"); //값이 0번째에 들어가면 0번쨰 있는 값은 뒤로 하나씩 밀려나감
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 리스트 항목 삭제 : remove(idx) -> ArrayList에 특정 idx 삭제
		list.remove(1); //값이 삭제되면 뒤에 있는 값들이 하나씩 앞으로 감
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		//리스트에 특정 항목이 포함되어 있는지와 여부 반환
		System.out.println(list.contains("홍길동"));
		
		if(!(list.contains("이몽룡"))) {
			list.add("이몽룡");
		}
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
	}

}
