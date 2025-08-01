package GenericCollection.sec06;
import java.util.*;
public class ListGenMain {

	public static void main(String[] args) {
		// 제네릭 타입으로 ArrayList 사용 -> List interface 활용
		// ArrayList : string 객체만 저장 기능
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("DB");
		list.add("HTML");
		list.add("java");
		//list.add(100); //String으로 타입을 구체화 했으므로 String 외 타입은 저장이 불가함
		
		System.out.println("총 객체 수 : "+list.size());
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		list.remove(1);
		
		for(String value : list) {
			System.out.println(value);
		}
		System.out.println();
		list.add("MultiMedia");
		//list.get(i_반환값은 문자열 : length() 사용 가능(글자 수 반환)
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i) + " : " + list.get(i).length());
		}
		
		for(String value : list) {
			System.out.println(value.length());
		}
	}

}
